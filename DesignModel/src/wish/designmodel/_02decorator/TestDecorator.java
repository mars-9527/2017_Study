package wish.designmodel._02decorator;

/**
 * װ��ģʽ��Ϊ���й��ܶ�̬����Ӹ��๦�ܵ�һ�ַ�ʽ�������������Ϊ���
 */
public class TestDecorator {

	public static void main(String[] args) {
		Person p = new Person("Cai");
		TShirts ts = new TShirts();
		Suit s = new Suit();
		BigTrouser bt = new BigTrouser();
		
		ts.Decorate(p);
		s.Decorate(ts);
		bt.Decorate(s);
		bt.Show();
		
	}

}
