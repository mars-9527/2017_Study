package wish.designmodel._10abstractfactory;

/**
 * ���󹤳�ģʽ���ṩһ������һϵ����ػ��໥��������Ľӿڣ�������ָ�����Ǿ�����ࡣ
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
