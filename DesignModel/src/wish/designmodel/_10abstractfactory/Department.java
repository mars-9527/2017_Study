package wish.designmodel._10abstractfactory;

public class Department implements IDepartment {

	@Override
	public void Insert(Department department) {
		System.out.println("Insert Department");
	}

	@Override
	public Department GetDepartment(int id) {
		System.out.println("Get Department");
		return null;
	}

}
