package wish.designmodel._21flyweight;

/**
 * ��Ԫģʽ�����ù�������Ч��֧�ִ���ϸ���ȵĶ��󡣣��������
 * 
 * ��Ԫģʽ���Ա�������ǳ�������Ŀ���������Ķ���Խ�࣬��Լ��Խ�ࡣ
 */
public class TestFlyweight {

	public static void main(String[] args) {
		int extrinsicstate = 22;//�ⲿ״̬
		
		FlyweightFactory f = new FlyweightFactory();
		
		Flyweight fx1 = f.getFlyweight("X");
		fx1.operation(--extrinsicstate);
		Flyweight fx2 = f.getFlyweight("X");
		fx2.operation(--extrinsicstate);
		
		Flyweight fy = f.getFlyweight("Y");
		fy.operation(--extrinsicstate);
		
		Flyweight fz = f.getFlyweight("Z");
		fz.operation(--extrinsicstate);
		
		Flyweight uf = new UnsharedConcreteFlyweight();
		uf.operation(--extrinsicstate);
	}

}
