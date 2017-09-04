package wish.designmodel._19chainofresponsibility;

abstract class Manager {
	protected String name;
	protected Manager superior;
	
	public Manager(String name){
		this.name = name;
	}
	
	public void setSuperior(Manager superior){//�ڿͻ����������ϼ�
		this.superior = superior;
	}
	/**
	 * ��������
	 */
	abstract public void requestApplications(Request request);
}
