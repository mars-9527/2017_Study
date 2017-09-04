package wish.designmodel._15iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体聚集类
 */
class ConcreteAggregate extends Aggregate {

	private List<Object> items = new ArrayList<Object>();//items用于存储聚合对象
	
	@Override
	public Iterator createIterator() {
		return new ConcreteIterator(this);////
	}
	
	@Override
	public int getCount(){
		return items.size();
	}
	
	@Override
	public Object get(int index){
		return items.get(index);
	}

	@Override
	public void set(int index, Object obj){
		items.add(index, obj);
	}
	
}
