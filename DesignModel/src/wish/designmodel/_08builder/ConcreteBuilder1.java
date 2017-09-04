package wish.designmodel._08builder;

/**
 * ���彨���߸��ݳ������߹涨�ı�׼������Product��
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
