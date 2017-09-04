package wish.designmodel._12adapter;

class Guards extends Player {

	public Guards(String name) {
		super(name);
	}

	@Override
	public void Attack() {
		System.out.println("Guards Attack");
	}

	@Override
	public void Defense() {
		System.out.println("Guards Defense");
	}

}
