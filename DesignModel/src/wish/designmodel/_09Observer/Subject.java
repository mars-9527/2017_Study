package wish.designmodel._09Observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ����֪ͨ���ṩһ���ӿڣ��������ӡ�ɾ����֪ͨ�۲��߶���
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
