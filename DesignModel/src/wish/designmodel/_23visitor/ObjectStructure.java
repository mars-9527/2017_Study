package wish.designmodel._23visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * ����ṹ�࣬��ö������Ԫ�أ������ṩһ���߲�Ľӿ�����������߷�������Ԫ�ء�
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
