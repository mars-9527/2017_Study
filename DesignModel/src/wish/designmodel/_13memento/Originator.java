package wish.designmodel._13memento;

/**
 * 发起人类：
 * 1.创建一个备忘录，并记录当前时刻它的内部状态（createMemento()）；
 * 2.使用备忘录恢复内部状态（setMemento()）。
 */
class Originator {
	private String state;
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public Memento createMemento(){
		return (new Memento(state));
	}
	public void setMemento(Memento memento){
		state = memento.getState();
	}
	public void show(){
		System.out.println("State: " + state);
	}
}
