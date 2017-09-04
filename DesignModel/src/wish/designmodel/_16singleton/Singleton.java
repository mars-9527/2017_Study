package wish.designmodel._16singleton;

/**
 * �����Լ������Ƿ����ʵ���������̰߳�ȫ�������SingletonDoubleCheckLocking���SingletonFinal��
 */
class Singleton {
	private static Singleton instance;//1.����һ����̬�����������
	
	private Singleton(){//2.�����췽��˽�л����ⲿ���벻��ֱ��new��ʵ������
		
	}
	
	public static Singleton getInstance(){//3.�õ���ʵ���ķ���������ֵ���Ǳ������ע��Ҳ�Ǿ�̬��
		if(instance == null){//4.�ж��������Ƿ�ʵ�� ������ֻ֤�᷵��һ������
			instance = new Singleton();
		}
		
		return instance;
	}
}
