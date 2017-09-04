package wish.designmodel._12adapter;

class ForeignCenter {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void 进攻(){
		System.out.println("中国中锋进攻");
	}
	public void 防守(){
		System.out.println("中国中锋防守");
	}
}
