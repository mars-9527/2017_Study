package wish.designmodel._16singleton;

/**
 * ����ģʽ����֤һ�������һ��ʵ�������ṩһ����������ȫ�ַ��ʵ㡣
 * 
 * ���������𱣴�����Ψһʵ�����������Ա�֤û������ʵ�����Ա�������
 * �����������ṩһ�����ʸ�ʵ���ķ�����
 */
public class TestSingleton {

	public static void main(String[] args) {
//		Singleton s1 = Singleton.getInstance();
//		Singleton s2 = Singleton.getInstance();
//		SingletonDoubleCheckLocking s1 = SingletonDoubleCheckLocking.getInstance();
//		SingletonDoubleCheckLocking s2 = SingletonDoubleCheckLocking.getInstance();
		SingletonFinal s1 = SingletonFinal.getInstance();
		SingletonFinal s2 = SingletonFinal.getInstance();
		
		if(s1 == s2){
			System.out.println("The same.");
		}
	}

}
