package wish.designmodel._23visitor;

class Success extends Action {

	@Override
	public void getManConclusion(Man m) {
		System.out.println("When " + m.toString() + " " + this.toString() + ",there is a great woman behind him.");
	}

	@Override
	public void getWomanConclusion(Woman w) {
		System.out.println("When " + w.toString() + " " + this.toString() + ",there is a failing man behind her.");
	}

	@Override
	public String toString() {
		return "Success";
	}

}
