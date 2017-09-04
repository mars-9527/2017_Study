package wish.designmodel._20mediator;

abstract class Mediator {
	/**
	 * 得到Colleague对象和发送信息
	 */
	public abstract void send(String message, Colleague colleague);
}
