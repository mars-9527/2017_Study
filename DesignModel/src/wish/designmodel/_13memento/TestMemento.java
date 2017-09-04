package wish.designmodel._13memento;

/**
 * 备忘录模式，在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。
 * 这样以后就可将该对象恢复到原先保存的状态。
 */
public class TestMemento {

	public static void main(String[] args) {
		Originator o = new Originator();
		o.setState("On");//1.初始化状态
		o.show();
		
		CareTaker ct = new CareTaker();
		ct.setMemento(o.createMemento());//2.保存状态
		
		o.setState("Off");//3.状态改变
		o.show();
		
		o.setMemento(ct.getMemento());//4.恢复原始状态
		o.show();
	}

}
