package wish.designmodel._16singleton;

/**
 * ��̬��ʼ��
 */
final class SingletonFinal {//1.��ֹ�౻����
	private static final SingletonFinal instance = new SingletonFinal();//2.��һ��������ʱ����finalʵ��
	private SingletonFinal(){
		
	}
	public static SingletonFinal getInstance(){
		return instance;
	}
}
