package wish.designmodel._21flyweight;

/**
 * Ϊ�ڲ�״̬���Ӵ洢�ռ�
 */
class ConcreteFlyweight extends Flyweight {

	@Override
	public void operation(int extrinsicstate) {
		System.out.println("Concrete Flyweight: " + extrinsicstate);
	}

}
