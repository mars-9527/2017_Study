package wish.designmodel._10abstractfactory;

class SqlserverDepartment implements IDepartment {

	@Override
	public void Insert(Department department) {
		System.out.println("Insert Sqlserver Department");
	}

	@Override
	public Department GetDepartment(int id) {
		System.out.println("Get Sqlserver Department");
		return null;
	}

}
