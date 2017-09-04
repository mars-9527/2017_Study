package wish.designmodel._23visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 对象结构类，能枚举它的元素，可以提供一个高层的接口以允许访问者访问它的元素。
 * 
 */
class ObjectStructure {
	private List<Person> elements = new ArrayList<Person>();
	
	public void attach(Person element){
		elements.add(element);
	}
	
	public void detach(Person element){
		elements.remove(element);
	}
	
	public void display(Action visitor){
		for(Person p : elements){
			p.accept(visitor);
		}
	}
}
