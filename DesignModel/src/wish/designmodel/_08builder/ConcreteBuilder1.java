package wish.designmodel._08builder;

/**
 * 具体建造者根据抽象建造者规定的标准来建造Product。
 */
class ConcreteBuilder1 extends Builder {

	private Product product = new Product();
	
	@Override
	public void buildPartA() {
		product.Add("Part A");
	}

	@Override
	public void buildPartB() {
		product.Add("Part B");
	}

	@Override
	public Product getResult() {
		return product;
	}

}
