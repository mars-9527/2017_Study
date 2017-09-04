package wish.designmodel._08builder;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 产品类，可由多个部件组成
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
