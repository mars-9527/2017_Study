package wish.designmodel._17bridge;

/**
 * �Ž�ģʽ�������󲿷�������ʵ�ֲ��ַ��룬ʹ���Ƕ����Զ����ر仯��
 * 
 * ����ʵ�ֵķ�ʽ�ж��֣��Ž�ģʽ�ĺ�����ͼ���ǰ���Щʵ�ֶ��������������Ǹ��Եر仯��
 * ���ʹ��ÿ��ʵ�ֵı仯��Ӱ������ʵ�֣��Ӷ��ﵽӦ�Ա仯��Ŀ�ġ�
 * 
 * ���ó���ġ��ֻ����ȿ��԰�Ʒ�������࣬Ҳ���԰��չ��������࣬���ֻ�Ʒ���о��ֻ����ܡ�
 */
public class TestBridge {

	public static void main(String[] args) {
		Abstraction ab = new RefinedAbstraction();
		
		ab.setImplementor(new ConcreteImplementorA());
		ab.operation();
		
		ab.setImplementor(new ConcreteImplementorB());
		ab.operation();
		
		Abstraction ab1 = new RefinedAbstraction();
		ab1.setImplementor(new ConcreteImplementorB());
		ab1.operation();
	}

}
