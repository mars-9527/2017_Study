package wish.designmodel._16singleton;

/**
 * 由类自己决定是否进行实例化。非线程安全，请参照SingletonDoubleCheckLocking类和SingletonFinal类
 */
class Singleton {
	private static Singleton instance;//1.声明一个静态的自身类变量
	
	private Singleton(){//2.将构造方法私有化，外部代码不能直接new来实例化它
		
	}
	
	public static Singleton getInstance(){//3.得到类实例的方法，返回值就是本类对象，注意也是静态的
		if(instance == null){//4.判断若对象是否实例 化，保证只会返回一个对象
			instance = new Singleton();
		}
		
		return instance;
	}
}
