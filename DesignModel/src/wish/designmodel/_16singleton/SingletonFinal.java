package wish.designmodel._16singleton;

/**
 * 静态初始化
 */
final class SingletonFinal {//1.阻止类被派生
	private static final SingletonFinal instance = new SingletonFinal();//2.第一次引用类时创建final实例
	private SingletonFinal(){
		
	}
	public static SingletonFinal getInstance(){
		return instance;
	}
}
