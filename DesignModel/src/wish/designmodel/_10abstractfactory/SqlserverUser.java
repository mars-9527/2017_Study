package wish.designmodel._10abstractfactory;

class SqlserverUser implements IUser {

	@Override
	public void Insert(User user) {
		System.out.println("Insert Sqlserver User");
	}

	@Override
	public User GetUser(int id) {
		System.out.println("Get Sqlserver User");
		return null;
	}

}
