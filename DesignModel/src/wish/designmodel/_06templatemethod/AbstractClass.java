package wish.designmodel._06templatemethod;

abstract class AbstractClass {
	public abstract void primitiveOperation1();
	public abstract void primitiveOperation2();
	
	//���������ظ����ֵ���Ϊ���Ƶ���������
	public void templateMethod(){//�ڴ���֯�㷨�Ǽܡ�һЩ�����ʵ��(��PrimitiveOperation1)�ŵ�������ʵ�֡�
		primitiveOperation1();
		primitiveOperation2();
		otherFunction();
	}
	
	private void otherFunction(){
		System.out.println("Other Template Methods");
	}
}
