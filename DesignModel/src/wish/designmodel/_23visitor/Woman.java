package wish.designmodel._23visitor;

class Woman extends Person {

	@Override
	public void accept(Action visitor) {
		visitor.getWomanConclusion(this);
	}

	@Override
	public String toString() {
		return "Woman";
	}

}
