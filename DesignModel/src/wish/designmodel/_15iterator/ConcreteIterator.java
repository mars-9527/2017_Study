package wish.designmodel._15iterator;

/**
 * 具体迭代器类
 */
class ConcreteIterator extends Iterator {

	private ConcreteAggregate aggregate;
	private int current = 0;
	
	public ConcreteIterator(ConcreteAggregate aggregate) {//初始化，将具体的聚集对象传入
		this.aggregate = aggregate;
	}

	@Override
	public Object first() {
		return aggregate.get(0);
	}

	@Override
	public Object next() {
		Object ret = null;
		
		current++;
		if(current < aggregate.getCount()){
			ret = aggregate.get(current);
		}
		
		return ret;
	}

	@Override
	public boolean hasNext() {
		return current >= aggregate.getCount() ? true : false;
	}

	@Override
	public Object currentItem() {
		return aggregate.get(current);
	}

}
