package wish.designmodel._08builder;

/**
 * 建造者模式（生成器模式）将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。
 */
public class TestBuilder {
	//客户端不需知道具体的建造过程
	public static void main(String[] args) {
		Director director = new Director();
		Builder b1 = new ConcreteBuilder1();
		Builder b2 = new ConcreteBuilder2();
		
		director.Construct(b1);//指挥b1完成建造
		Product p1 = b1.getResult();//返回建造的产品
		p1.Show();
		
		director.Construct(b2);
		Product p2 = b2.getResult();
		p2.Show();
	}

}
