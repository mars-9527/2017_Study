package aop;

interface Dun {// dun 债务
	public void getMoney();
}

class creditor implements Dun {// creditor 债主
	public void getMoney() {
		System.out.println("get My Money");
	}
}

class ProxyDun implements Dun {// ProxyDun讨债人
	Dun dun;

	public ProxyDun(Dun dun) {
		this.dun = dun;
	}

	public void getMoney() {
		System.out.println("我帮你讨债");
		dun.getMoney();
		System.out.println("讨债结束......");
	}
}

public class StaticProxyDemo1 {
	public static void main(String[] args) {
		Dun test = new ProxyDun(new creditor());
		test.getMoney();
	}
}

