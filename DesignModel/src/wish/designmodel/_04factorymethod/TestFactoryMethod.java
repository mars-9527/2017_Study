package wish.designmodel._04factorymethod;

/**
 * 工厂方法定义一个用于创建对象的接口，让子类决定实例化哪一个类 。工厂方法使用一个类的实例化延迟到其子类。
 * 
 * 工厂方法克服了简单工厂违背开放-封闭原则的缺点，又保持了封装对象创建过程的优点。
 * 简单工厂方法是客户端告诉程序需要什么，程序就返回什么对象。工厂方法是客户端直接调用产生此对象的工厂类来返回需要的对象。
 */
public class TestFactoryMethod {

	public static void main(String[] args) {
		Factory f = new UndergraduateFactory();//*****直接替换UndergraduateFactory可更换不同的人来当雷锋
		//Factory f = new VolunteerFactory();
		LeiFeng lf = f.CreateLeiFeng();
		lf.Sweep();
		lf.Wash();
	}

}
