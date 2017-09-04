package wish.designmodel._20mediator;

/**
 * 具体同事类只知道自己的行为，而不了解其它同事类的情况，但它们认识中介者对象。通过中介对象转达信息
 */
class ConcreteColleague1 extends Colleague {

	public ConcreteColleague1(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void send(String message){
		mediator.send(message, this);//通过中介者发送信息
	}
	
	@Override
	public void notice(String message){
		System.out.println("ConcreteColleague1 get: " + message);
	}
	
}
