package wish.designmodel._10abstractfactory;

public class AccessUser implements IUser {

	@Override
	public void Insert(User user) {
		System.out.println("Insert Access User");
	}

	@Override
	public User GetUser(int id) {
		System.out.println("Get Access User");
		return null;
	}

}
