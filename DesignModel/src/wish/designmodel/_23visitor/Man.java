package wish.designmodel._23visitor;

class Man extends Person {

	@Override
	public void accept(Action visitor) {
		visitor.getManConclusion(this);//À´∑÷≈…ºº ı
	}

	@Override
	public String toString() {
		return "Man";
	}
}
