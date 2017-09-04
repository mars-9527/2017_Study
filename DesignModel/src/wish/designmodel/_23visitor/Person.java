package wish.designmodel._23visitor;

abstract class Person {
	protected String action;

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}
	
	public abstract void accept(Action visitor);
}
