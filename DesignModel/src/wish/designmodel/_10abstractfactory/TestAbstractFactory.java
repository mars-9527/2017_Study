package wish.designmodel._10abstractfactory;

/**
 * 抽象工厂模式，提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类。
 */
public class TestAbstractFactory {

	public static void main(String[] args) {
		User user = new User();
		Department department = new Department();
		
		//IFactory factory = new SqlserverFactory();
		IFactory factory = new AccessFactory();
		
		IUser iuser = factory.CreateUser();
		//IUser iuser = DataAccess.CreateUser();
		iuser.Insert(user);
		iuser.GetUser(1);
		
		IDepartment idepartment = factory.CreateDepartment();
		//IDepartment idepartment = DataAccess.CreateDepartment();
		idepartment.Insert(department);
		idepartment.GetDepartment(1);
	}

}
