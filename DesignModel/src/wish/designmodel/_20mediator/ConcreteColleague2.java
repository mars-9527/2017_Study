package wish.designmodel._20mediator;

class ConcreteColleague2 extends Colleague {

	public ConcreteColleague2(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void send(String message){
		mediator.send(message, this);
	}

	@Override
	public void notice(String message){
		System.out.println("ConcreteColleague2 get: " + message);
	}
	
}
