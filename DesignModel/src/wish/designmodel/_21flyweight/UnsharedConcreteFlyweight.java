package wish.designmodel._21flyweight;

/**
 * ����Ҫ�����Flyweight���ࡣFlyweightʹ�����Ϊ���ܣ���������ǿ�ƹ���
 */
class UnsharedConcreteFlyweight extends Flyweight {

	@Override
	public void operation(int extrinsicstate) {
		System.out.println("Unshared Concrete Flyweight: " + extrinsicstate);
	}

}
