package wish.designmodel._21flyweight;

/**
 * 不需要共享的Flyweight子类。Flyweight使共享成为可能，但它并不强制共享。
 */
class UnsharedConcreteFlyweight extends Flyweight {

	@Override
	public void operation(int extrinsicstate) {
		System.out.println("Unshared Concrete Flyweight: " + extrinsicstate);
	}

}
