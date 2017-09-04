package wish.designmodel._15iterator;

/**
 * ������ģʽ���ṩһ�ַ���˳�����һ���ۺ϶����и���Ԫ�أ����ֲ���¶�ö�����ڲ���ʾ��
 * 
 * ������ģʽ�����˼��϶���ı�����Ϊ�������һ���������������������ȿ�����������¶���ϵ��ڲ��ṹ��
 * �ֿ����ⲿ����͸���ط��ʼ����ڲ������ݡ�
 */
public class TestIterator {

	public static void main(String[] args) {
		ConcreteAggregate a = new ConcreteAggregate();
		
		a.set(0, "a");
		a.set(1, "b");
		a.set(2, "c");
		
		Iterator iterator = new ConcreteIterator(a);
		while(!iterator.hasNext()){
			System.out.println(iterator.currentItem());
			iterator.next();
		}
	}

}
