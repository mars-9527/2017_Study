package wish.designmodel._21flyweight;

/**
 * 为内部状态增加存储空间
 */
class ConcreteFlyweight extends Flyweight {

	@Override
	public void operation(int extrinsicstate) {
		System.out.println("Concrete Flyweight: " + extrinsicstate);
	}

}
