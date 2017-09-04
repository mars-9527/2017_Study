package wish.designmodel._12adapter;

/**
 * 适配器模式，将一个类的接口转换成客户希望的另外一个接口，
 * Adapter模式*使得原本由于接口不兼容而不能一起工作的那些类可以一起工作*。
 */
public class TestAdapter {

	public static void main(String[] args) {
		Player f = new Forwards("BaDiEr");
		f.Attack();
		f.Defense();
		
		Player g = new Guards("Mac");
		g.Attack();
		g.Defense();
		
		Player ym = new Translator("姚明");
		ym.Attack();
		ym.Defense();
	}

}
