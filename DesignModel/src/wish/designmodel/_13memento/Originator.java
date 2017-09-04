package wish.designmodel._13memento;

/**
 * �������ࣺ
 * 1.����һ������¼������¼��ǰʱ�������ڲ�״̬��createMemento()����
 * 2.ʹ�ñ���¼�ָ��ڲ�״̬��setMemento()����
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
