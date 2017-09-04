package wish.designmodel._06templatemethod;

/**
 * ģ�巽��ģʽ����һ�������е��㷨�ĹǼܣ�����һЩ�����ӳٵ������С�
 * ģ�巽��ʹ��������Բ��ı�һ���㷨�Ľṹ�����ض�����㷨��ĳЩ�ض����衣
 */
public class TestTemplateMethod {

	public static void main(String[] args) {
		AbstractClass ac;
		
		ac = new ConcreteClassA();
		ac.templateMethod();
		
		ac = new ConcreteClassB();
		ac.templateMethod();
	}

}
