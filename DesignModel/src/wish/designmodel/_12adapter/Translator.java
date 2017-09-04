package wish.designmodel._12adapter;

/**
 * Adapter�࣬��ForeignCenter��ķ���ת���ɿͻ�ϣ���Ľӿ�
 * 
 * Translator�̳�Player�����м�ת�ӹ��ܣ�ʹ��ForeignCenter������Playerһ�¡�
 */
class Translator extends Player {
	private ForeignCenter fc = new ForeignCenter();

	public Translator(String name) {
		super(name);
		fc.setName(name);
	}

	@Override
	public void Attack() {
		fc.����();
	}

	@Override
	public void Defense() {
		fc.����();
	}

}
