package wish.designmodel._08builder;

/**
 * 抽象建造者类，确定产品由两个部件PartA和PartB组成，
 * 并声明一个得到产品建造后结果的方法GetResult。
 * 
 * 具体建造者根据抽象建造者规定的标准来建造Product。
 */
abstract class Builder {
	public abstract void buildPartA();
	public abstract void buildPartB();
	public abstract Product getResult();
}
