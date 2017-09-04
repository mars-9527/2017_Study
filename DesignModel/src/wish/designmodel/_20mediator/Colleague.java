package wish.designmodel._20mediator;

abstract class Colleague {
	protected Mediator mediator;
	
	public Colleague(Mediator mediator){
		this.mediator = mediator;
	}
	
	public abstract void send(String message);
	public abstract void notice(String message);
}
