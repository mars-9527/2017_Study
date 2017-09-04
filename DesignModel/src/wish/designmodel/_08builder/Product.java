package wish.designmodel._08builder;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ��Ʒ�࣬���ɶ���������
 */
class Product {
	List<String> parts = new ArrayList<String>();
	
	public void Add(String part){
		parts.add(part);
	}
	
	public void Show(){
		System.out.println("\nProduct Create --- ");
		Iterator<String> iterator = parts.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
}
