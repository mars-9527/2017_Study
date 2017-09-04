package wish.designmodel._12adapter;

/**
 * Adapter类，将ForeignCenter类的方法转换成客户希望的接口
 * 
 * Translator继承Player，起到中间转接功能，使用ForeignCenter与其它Player一致。
 */
class Translator extends Player {
	private ForeignCenter fc = new ForeignCenter();

	public Translator(String name) {
		super(name);
		fc.setName(name);
	}

	@Override
	public void Attack() {
		fc.进攻();
	}

	@Override
	public void Defense() {
		fc.防守();
	}

}
