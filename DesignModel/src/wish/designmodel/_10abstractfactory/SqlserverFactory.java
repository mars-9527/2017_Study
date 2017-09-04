package wish.designmodel._10abstractfactory;

public class SqlserverFactory implements IFactory {

	@Override
	public IUser CreateUser() {
		return new SqlserverUser();
	}

	@Override
	public IDepartment CreateDepartment() {
		return new SqlserverDepartment();
	}

}
