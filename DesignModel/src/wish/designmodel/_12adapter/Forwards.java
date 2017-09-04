package wish.designmodel._12adapter;

class Forwards extends Player {

	public Forwards(String name) {
		super(name);
	}

	@Override
	public void Attack() {
		System.out.println("Forwards Attack");
	}

	@Override
	public void Defense() {
		System.out.println("Forwards Defense");
	}

}
