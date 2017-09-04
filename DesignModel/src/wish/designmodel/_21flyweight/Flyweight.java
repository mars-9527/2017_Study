package wish.designmodel._21flyweight;

/**
 * 所有具体亨元类的超类或接口，通过这个接口，Flyweight可以接受并作用于外部状态extrinsicstate:Object。
 */
abstract class Flyweight {
	public abstract void operation(int extrinsicstate);
}
