package wish.designmodel._17bridge;

class Abstraction {
	protected Implementor imp;//�ۺϹ�ϵ
	
	public void setImplementor(Implementor imp){
		this.imp = imp;
	}
	public void operation(){
		imp.operation();
	}
}
