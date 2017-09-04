package wish.designmodel._10abstractfactory;

/**
 * 用简单工厂来改进抽象工厂，可抛弃IFactory，SqlserverFactory，AccessFactory三个工厂类
 */
public class DataAccess {
	private static final String db = "Sqlserver";//可使用反射技术，在配置文件中配置数据库字符串
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
