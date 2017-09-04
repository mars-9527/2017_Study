package wish.designmodel._12adapter;

class Center extends Player {

	public Center(String name) {
		super(name);
	}

	@Override
	public void Attack() {
		System.out.println("Center Attack");
	}

	@Override
	public void Defense() {
		System.out.println("Center Defense");
	}

}
