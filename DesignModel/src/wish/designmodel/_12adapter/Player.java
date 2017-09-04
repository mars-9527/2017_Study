package wish.designmodel._12adapter;

abstract class Player {
	protected String name;
	public Player(String name){
		this.name = name;
	}
	
	public abstract void Attack();
	public abstract void Defense();
}
