package wish.designmodel._13memento;

/**
 * ����¼ģʽ���ڲ��ƻ���װ�Ե�ǰ���£�����һ��������ڲ�״̬�����ڸö���֮�Ᵽ�����״̬��
 * �����Ժ�Ϳɽ��ö���ָ���ԭ�ȱ����״̬��
 */
public class TestMemento {

	public static void main(String[] args) {
		Originator o = new Originator();
		o.setState("On");//1.��ʼ��״̬
		o.show();
		
		CareTaker ct = new CareTaker();
		ct.setMemento(o.createMemento());//2.����״̬
		
		o.setState("Off");//3.״̬�ı�
		o.show();
		
		o.setMemento(ct.getMemento());//4.�ָ�ԭʼ״̬
		o.show();
	}

}
