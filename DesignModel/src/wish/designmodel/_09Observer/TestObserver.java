package wish.designmodel._09Observer;

/**
 * �۲���ģʽ������һ��һ�Զ��������ϵ���ö���۲��߶���ͬʱ����ĳһ���������
 * ������������״̬�����仯ʱ����֪ͨ���й۲��߶���ʹ�����ܹ��Զ������Լ���
 * 
 * �۲���ģʽ�г���֪ͨ����������۲��ߣ���ÿ������۲��߲�һ������Ҫ����update()������
 * ʹ��ί�У�֪ͨ�ߺ͹۲��߿��Ի���֪�����ɿͻ���������֪ͨ˭���ɽ���������⡣
 */
class TestObserver {

	public static void main(String[] args) {
		ConcreteSubject s = new ConcreteSubject();
		
		s.attach(new ConcreteObserver(s, "X"));
		s.attach(new ConcreteObserver(s, "Y"));
		
		s.setSubjectState("aaa");
		s.noticeAll();
	}

}
