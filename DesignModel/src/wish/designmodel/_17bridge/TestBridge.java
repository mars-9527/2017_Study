package wish.designmodel._17bridge;

/**
 * 桥接模式，将抽象部分与它的实现部分分离，使它们都可以独立地变化。
 * 
 * 由于实现的方式有多种，桥接模式的核心意图就是把这些实现独立出来，让它们各自地变化。
 * 这就使得每种实现的变化不影响其他实现，从而达到应对变化的目的。
 * 
 * 如让抽象的“手机”既可以按品牌来分类，也可以按照功能来分类，在手机品牌中聚手机功能。
 */
public class TestBridge {

	public static void main(String[] args) {
		Abstraction ab = new RefinedAbstraction();
		
		ab.setImplementor(new ConcreteImplementorA());
		ab.operation();
		
		ab.setImplementor(new ConcreteImplementorB());
		ab.operation();
		
		Abstraction ab1 = new RefinedAbstraction();
		ab1.setImplementor(new ConcreteImplementorB());
		ab1.operation();
	}

}
