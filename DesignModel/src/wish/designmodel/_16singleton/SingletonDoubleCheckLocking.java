package wish.designmodel._16singleton;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 多线程的单例：双重锁定。保证多线程环境下也不会造成多个实例的生成。
 */
class SingletonDoubleCheckLocking {
	private static SingletonDoubleCheckLocking instance;
	//private static final Object syncRoot = new Object();
	private static Lock lock = new ReentrantLock();
	
	private SingletonDoubleCheckLocking(){
		
	}
	
	public static SingletonDoubleCheckLocking getInstance(){
		if(instance == null){
			lock.lock();
			try{
			//synchronized(syncRoot){
				if(instance == null){
					instance = new SingletonDoubleCheckLocking();
				//}
				}
			} finally{
				lock.unlock();
			}
		}
		
		return instance;
	}
}
