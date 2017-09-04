package wish.designmodel._20mediator;

public class TestMediator {

	public static void main(String[] args) {
		ConcreteMediator m = new ConcreteMediator();
		
		//1.�þ���ͬ������ʶ�н��߶���
		ConcreteColleague1 c1 = new ConcreteColleague1(m);
		ConcreteColleague2 c2 = new ConcreteColleague2(m);
		
		//2.���н�����ʶ��������ͬ�������
		m.setColleague1(c1);
		m.setColleague2(c2);
		
		//3.����ͬ�������ķ�����Ϣ����ͨ���н���ת��
		c1.send("msg sent by c1");
		c2.send("msg sent by c2");
	}

}
