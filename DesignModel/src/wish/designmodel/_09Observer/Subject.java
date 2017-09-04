package wish.designmodel._09Observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 抽象通知者提供一个接口，可以增加、删除和通知观察者对象
 */
abstract class Subject {
	private List<Observer> observers = new ArrayList<Observer>();
	
	public void attach(Observer observer){
		observers.add(observer);
	}
	
	public void detach(Observer observer){
		observers.remove(observer);
	}
	
	public void noticeAll(){
		Iterator<Observer> iterator = observers.iterator();
		while(iterator.hasNext()){
			iterator.next().update();
		}
	}
}
