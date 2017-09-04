package wish.designmodel._08builder;

/**
 * 指挥者类，是构建一个使用Builder接口的对象。用来指挥建造过程。
 */
class Director {
	public void Construct(Builder builder){
		builder.buildPartA();
		builder.buildPartB();
	}
}
