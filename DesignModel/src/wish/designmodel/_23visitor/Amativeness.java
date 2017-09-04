package wish.designmodel._23visitor;

/**
 * æﬂÃÂVisitor¿‡
 */
class Amativeness extends Action {

	@Override
	public void getManConclusion(Man m) {
		System.out.println("When " + m.toString() + " " + this.toString() + ",pretend to know everything.");
	}

	@Override
	public void getWomanConclusion(Woman w) {
		System.out.println("When " + w.toString() + " " + this.toString() + ",pretend to know nothing.");
	}

	@Override
	public String toString() {
		return "Amativeness";
	}
}
