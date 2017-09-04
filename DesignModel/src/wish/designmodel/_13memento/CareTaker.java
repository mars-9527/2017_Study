package wish.designmodel._13memento;

/**
 * 管理者类:
 * 保存好备忘录（防止Originator以外的类访问备忘录），得到或设置备忘录。
 */
class CareTaker {
	private Memento memento;

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}
	
}
