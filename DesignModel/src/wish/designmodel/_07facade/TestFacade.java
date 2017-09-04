package wish.designmodel._07facade;

/**
 * 外观模式（门面模式）为子系统中的一组接口提供一个一致的界面，此模式定义了一个高层接口，
 * 这个接口使得这一子系统更加容易使用。
 */
class TestFacade {

	public static void main(String[] args) {
		Facade f = new Facade();
		f.methodA();
		f.methodB();
	}

}
