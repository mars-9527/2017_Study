package wish.designmodel._23visitor;

class Failing extends Action {

	@Override
	public void getManConclusion(Man m) {
		System.out.println("When " + m.toString() + " " + this.toString() + ",drink alone and nobody can advise.");
	}

	@Override
	public void getWomanConclusion(Woman w) {
		System.out.println("When " + w.toString() + " " + this.toString() + ",tear alone and nobody can advise.");
	}

	@Override
	public String toString() {
		return "Failing";
	}

}
