package wish.designmodel._20mediator;

/**
 * ����ͬ����ֻ֪���Լ�����Ϊ�������˽�����ͬ������������������ʶ�н��߶���ͨ���н����ת����Ϣ
 */
class ConcreteColleague1 extends Colleague {

	public ConcreteColleague1(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void send(String message){
		mediator.send(message, this);//ͨ���н��߷�����Ϣ
	}
	
	@Override
	public void notice(String message){
		System.out.println("ConcreteColleague1 get: " + message);
	}
	
}
