package wish.designmodel._20mediator;

abstract class Mediator {
	/**
	 * �õ�Colleague����ͷ�����Ϣ
	 */
	public abstract void send(String message, Colleague colleague);
}
