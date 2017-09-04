package wish.designmodel._20mediator;

public class TestMediator {

	public static void main(String[] args) {
		ConcreteMediator m = new ConcreteMediator();
		
		//1.让具体同事类认识中介者对象
		ConcreteColleague1 c1 = new ConcreteColleague1(m);
		ConcreteColleague2 c2 = new ConcreteColleague2(m);
		
		//2.让中介者认识各个具体同事类对象
		m.setColleague1(c1);
		m.setColleague2(c2);
		
		//3.具体同事类对象的发送信息都是通过中介者转发
		c1.send("msg sent by c1");
		c2.send("msg sent by c2");
	}

}
