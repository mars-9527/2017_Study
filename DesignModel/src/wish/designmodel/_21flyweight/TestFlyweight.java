package wish.designmodel._21flyweight;

/**
 * 亨元模式，运用共享技术有效地支持大量细粒度的对象。（共享对象）
 * 
 * 亨元模式可以避免大量非常相似类的开销。共享的对象越多，节约的越多。
 */
public class TestFlyweight {

	public static void main(String[] args) {
		int extrinsicstate = 22;//外部状态
		
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
