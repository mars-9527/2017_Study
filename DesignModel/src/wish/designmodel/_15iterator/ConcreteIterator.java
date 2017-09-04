package wish.designmodel._15iterator;

/**
 * �����������
 */
class ConcreteIterator extends Iterator {

	private ConcreteAggregate aggregate;
	private int current = 0;
	
	public ConcreteIterator(ConcreteAggregate aggregate) {//��ʼ����������ľۼ�������
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
