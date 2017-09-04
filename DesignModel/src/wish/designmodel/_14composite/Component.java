package wish.designmodel._14composite;

/**
 * 组合中的对象声明接口，在适当的情况下，*实现所有类共有接口的默认行为*。
 * 声明一个接口*用于访问和管理Component的子部件*。
 */
abstract class Component {
	protected String name;
	
	public Component(String name){
		this.name = name;
	}
	
	public abstract void add(Component c);
	public abstract void remove(Component c);
	public abstract void display(int depth);
}
