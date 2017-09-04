package wish.designmodel._23visitor;

/**
 * 访问者模式，表示一个作用于某对象结构中的各元素的操作。
 * 它使你可以在不改变各元素的类的前提下定义作用于这些元素的新操作。
 * 
 * 适用于数据结构相对稳定的系统。
 * 它把数据结构和作用于结构上的操作（算法）之间的耦合解脱开，使得操作集合可以相对自由地演化。
 * 目的是把处理从数据结构分离出来。
 */
public class TestVisitor {

	public static void main(String[] args) {
		ObjectStructure o = new ObjectStructure();
		o.attach(new Man());
		o.attach(new Woman());
		
		Success v1 = new Success();
		o.display(v1);
		Failing v2 = new Failing();
		o.display(v2);
		Amativeness v3 = new Amativeness();
		o.display(v3);
	}

}
