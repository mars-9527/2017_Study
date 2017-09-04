package wish.designmodel._19chainofresponsibility;

abstract class Manager {
	protected String name;
	protected Manager superior;
	
	public Manager(String name){
		this.name = name;
	}
	
	public void setSuperior(Manager superior){//在客户端设置其上级
		this.superior = superior;
	}
	/**
	 * 处理请求
	 */
	abstract public void requestApplications(Request request);
}
