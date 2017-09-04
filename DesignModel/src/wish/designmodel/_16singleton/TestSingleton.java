package wish.designmodel._16singleton;

/**
 * 单例模式，保证一个类仅有一个实例，并提供一个访问它的全局访问点。
 * 
 * 让类自身负责保存它的唯一实例。这个类可以保证没有其他实例可以被创建，
 * 并且它可以提供一个访问该实例的方法。
 */
public class TestSingleton {

	public static void main(String[] args) {
//		Singleton s1 = Singleton.getInstance();
//		Singleton s2 = Singleton.getInstance();
//		SingletonDoubleCheckLocking s1 = SingletonDoubleCheckLocking.getInstance();
//		SingletonDoubleCheckLocking s2 = SingletonDoubleCheckLocking.getInstance();
		SingletonFinal s1 = SingletonFinal.getInstance();
		SingletonFinal s2 = SingletonFinal.getInstance();
		
		if(s1 == s2){
			System.out.println("The same.");
		}
	}

}
