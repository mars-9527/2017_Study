package com.qinb.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.security.acl.LastOwnerException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CodeProducer {
	/*��ݿⲿ��*/
	private static final String JDBCNAME = "com.mysql.jdbc.Driver";
	private static final String DB_URL = "jdbc:mysql://192.168.0.200:3306/db_sourcepro";
	private static final String DB_USERNAME = "admin";
	private static final String DB_PASSWORD = "admin";
	
	private static String ENTITY_TYPE = "";
	private static String ENTITY_SETTER;
	private static String ENTITY_GETTER;
	private static String ENTITY_DAO;
	
	private static String src_path = System.getProperty("user.dir")+"/src/";
	private static String entity_Path = System.getProperty("user.dir") + "/src/com/qinb/entity/";
	private static String entity_pack = "com.qinb.entity";
	static Connection con = null;
	static ResultSet rs = null;
	static String sql = "";
	static{
		try {
			con = getCon();
			sql = "select * from t_code";
			rs = exeQuery(con, sql);
			if(rs.next()){
				ENTITY_SETTER = rs.getString("ENTITY_SETTER");
				ENTITY_GETTER = rs.getString("ENTITY_GETTER");
				ENTITY_DAO = rs.getString("ENTITY_DAO");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				closeCon(con);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	/**
	 * 
	 * @param entity_name Admin
	 * @param propertyMap
	 * @throws IOException 
	 */
	public static void createEntity(String entity_name,Map<String,String> propertyMap) throws IOException{
		if(!isFirstUpper(entity_name)){
			System.out.println("ʵ�������һ���ַ��д");
			entity_name = setFirstUpper(entity_name);
		}
		String fileName = entity_Path+entity_name+".java";
		File f = new File(fileName);
		if(!f.exists()){
			f.createNewFile();
		}else{
			f.delete();
			System.out.println(fileName+"�Ѿ����ڣ�ɾ��ɹ�");
		}
		System.out.println(fileName+"�����ɹ�");
		BufferedWriter out = new BufferedWriter(new FileWriter(fileName,true));
		out.write("package "+entity_pack+";\n\n");
		for(Map.Entry<String,String> entry:propertyMap.entrySet()){
			if("Date".equals(entry.getValue())){
				out.write("import java.util.Date; \n");	
				break;
			}
		}
		out.write("\npublic class "+entity_name+"{\n");
		for(Map.Entry<String,String> entry:propertyMap.entrySet()){
			out.write("\t private "+entry.getValue()+" "+entry.getKey()+";\n\n");			
		}		
		for(Map.Entry<String,String> entry:propertyMap.entrySet()){
			out.write(ENTITY_SETTER.
					replace("#%ENTITY_NAME_FirstUp#", setFirstUpper(entry.getKey())).
					replace("#%ENTITY_TYPE#",entry.getValue()).
					replace("#%ENTITY_NAME#", entry.getKey()));
			out.write("\n\n");
			out.write(ENTITY_GETTER.
					replace("#%ENTITY_NAME_FirstUp#", setFirstUpper(entry.getKey())).
					replace("#%ENTITY_TYPE#",entry.getValue()).
					replace("#%ENTITY_NAME#", entry.getKey()));
			out.write("\n\n");
		}
		out.write("\n}");
		out.flush();
		out.close();
	}
	
	public static void createEntityDao(String entity_name,String package_name) throws IOException{
		if(!isFirstUpper(entity_name)){
			System.out.println("ʵ�������һ���ַ��д");
			entity_name = setFirstUpper(entity_name);
		}
		String fileName = src_path+package_name.replace(".", "/")+"/"+entity_name+"Dao.java";
		File f = new File(fileName);
		if(!f.exists()){
			f.createNewFile();
		}else{
			f.delete();
			System.out.println(fileName+"�Ѿ����ڣ�ɾ��ɹ�");
		}
		System.out.println(fileName+"�����ɹ�");
		BufferedWriter out = new BufferedWriter(new FileWriter(fileName,true));
		out.write("package "+package_name+";\n\n");
		out.write("import java.util.List;\n\n");
		out.write("import "+package_name.substring(0,package_name.lastIndexOf("."))+"."+"entity."+entity_name+";\n");
		out.write("import com.qinb.entity.PageBean;\n\n");
		out.write(ENTITY_DAO.
				replace("#%ENTITY_CLASS#", entity_name).
				replace("#%ENTITY_OBJECT#", setFirstLower(entity_name)));
		out.flush();
		out.close();
	}
	
	
	public static Connection getCon() throws Exception{
		Class.forName(JDBCNAME);
		Connection con=DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
		return con;
	}
	
	public static void closeCon(Connection con)throws Exception{
		if(con!=null){
			con.close();
		}
	}
	
	public static ResultSet exeQuery(Connection con,String sql) throws SQLException{
		PreparedStatement pstmt = con.prepareStatement(sql);
		return pstmt.executeQuery();
	}
	public static int exeUpdate(Connection con,String sql) throws SQLException{
		PreparedStatement pstmt = con.prepareStatement(sql);
		return pstmt.executeUpdate();
	}
	public CallableStatement exeCall(Connection con,String sql) throws Exception{
		return con.prepareCall(sql);
	}
	public static void main(String[] args) {
		/*DbUtil dbUtil=new DbUtil();
		try {
			dbUtil.getCon();
			System.out.println("��ݿ����ӳɹ�");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("��ݿ�����ʧ��");
		}*/
		
		String entity_name = "student";
		String package_name = "com.qinb.dao";
		Map<String,String> map = new HashMap<String,String>();
		map.put("studentId", "int");
		map.put("studentName", "String");
		map.put("studentNum", "String");
		map.put("studentGrade", "Double");
		map.put("age", "Date");
		try {
			createEntity(entity_name, map);
			//createEntityDao(entity_name,package_name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static String setFirstLower(String str){
		return str.substring(0,1).toLowerCase()+str.substring(1);
	}
	public static boolean isFirstUpper(String str){
		char ch =str.charAt(0);
		if(Character.isUpperCase(ch)){
			return true;
		}else{
			return false;
		}
	}
	/**
	 * ���ַ��һ���ַ���д
	 * @param str
	 * @return
	 */
	public static String setFirstUpper(String str){
		return str.substring(0,1).toUpperCase()+str.substring(1);
	}
}
