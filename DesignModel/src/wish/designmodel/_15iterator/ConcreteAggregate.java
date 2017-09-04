package wish.designmodel._15iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * ����ۼ���
 */
class ConcreteAggregate extends Aggregate {

	private List<Object> items = new ArrayList<Object>();//items���ڴ洢�ۺ϶���
	
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
