package wish.designmodel._06templatemethod;

abstract class AbstractClass {
	public abstract void primitiveOperation1();
	public abstract void primitiveOperation2();
	
	//将子类中重复出现的行为搬移到抽象类中
	public void templateMethod(){//在此组织算法骨架。一些具体的实现(如PrimitiveOperation1)放到子类中实现。
		primitiveOperation1();
		primitiveOperation2();
		otherFunction();
	}
	
	private void otherFunction(){
		System.out.println("Other Template Methods");
	}
}
