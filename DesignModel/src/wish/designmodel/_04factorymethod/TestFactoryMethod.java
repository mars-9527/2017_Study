package wish.designmodel._04factorymethod;

/**
 * ������������һ�����ڴ�������Ľӿڣ����������ʵ������һ���� ����������ʹ��һ�����ʵ�����ӳٵ������ࡣ
 * 
 * ���������˷��˼򵥹���Υ������-���ԭ���ȱ�㣬�ֱ����˷�װ���󴴽����̵��ŵ㡣
 * �򵥹��������ǿͻ��˸��߳�����Ҫʲô������ͷ���ʲô���󡣹��������ǿͻ���ֱ�ӵ��ò����˶���Ĺ�������������Ҫ�Ķ���
 */
public class TestFactoryMethod {

	public static void main(String[] args) {
		Factory f = new UndergraduateFactory();//*****ֱ���滻UndergraduateFactory�ɸ�����ͬ���������׷�
		//Factory f = new VolunteerFactory();
		LeiFeng lf = f.CreateLeiFeng();
		lf.Sweep();
		lf.Wash();
	}

}
