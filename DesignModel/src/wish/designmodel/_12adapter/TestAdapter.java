package wish.designmodel._12adapter;

/**
 * ������ģʽ����һ����Ľӿ�ת���ɿͻ�ϣ��������һ���ӿڣ�
 * Adapterģʽ*ʹ��ԭ�����ڽӿڲ����ݶ�����һ��������Щ�����һ����*��
 */
public class TestAdapter {

	public static void main(String[] args) {
		Player f = new Forwards("BaDiEr");
		f.Attack();
		f.Defense();
		
		Player g = new Guards("Mac");
		g.Attack();
		g.Defense();
		
		Player ym = new Translator("Ҧ��");
		ym.Attack();
		ym.Defense();
	}

}
