package wish.designmodel._10abstractfactory;

public class AccessDepartment implements IDepartment {

	@Override
	public void Insert(Department department) {
		System.out.println("Insert Access Department");
	}

	@Override
	public Department GetDepartment(int id) {
		System.out.println("Get Access Department");
		return null;
	}

}
