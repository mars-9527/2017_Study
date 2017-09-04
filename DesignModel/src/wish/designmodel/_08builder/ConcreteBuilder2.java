package wish.designmodel._08builder;

class ConcreteBuilder2 extends Builder {

	private Product product = new Product();
	
	@Override
	public void buildPartA() {
		product.Add("Part X");
	}

	@Override
	public void buildPartB() {
		product.Add("Part Y");
	}

	@Override
	public Product getResult() {
		return product;
	}

}
