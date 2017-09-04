package wish.designmodel._10abstractfactory;

/**
 * �ü򵥹������Ľ����󹤳���������IFactory��SqlserverFactory��AccessFactory����������
 */
public class DataAccess {
	private static final String db = "Sqlserver";//��ʹ�÷��似�����������ļ����������ݿ��ַ���
	//private static String db = "Access";
	
	public static IUser CreateUser(){
		if(db.equals("Sqlserver")){
			return new SqlserverUser();
		}
		if(db.equals("Access")){
			return new AccessUser();
		}
		return null;
	}
	public static IDepartment CreateDepartment(){
		if(db.equals("Sqlserver")){
			return new SqlserverDepartment();
		}
		if(db.equals("Access")){
			return new AccessDepartment();
		}
		return null;
	}
}
