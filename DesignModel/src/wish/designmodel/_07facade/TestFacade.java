package wish.designmodel._07facade;

/**
 * ���ģʽ������ģʽ��Ϊ��ϵͳ�е�һ��ӿ��ṩһ��һ�µĽ��棬��ģʽ������һ���߲�ӿڣ�
 * ����ӿ�ʹ����һ��ϵͳ��������ʹ�á�
 */
class TestFacade {

	public static void main(String[] args) {
		Facade f = new Facade();
		f.methodA();
		f.methodB();
	}

}
