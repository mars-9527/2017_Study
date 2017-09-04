package wish.designmodel._23visitor;

/**
 * ������ģʽ����ʾһ��������ĳ����ṹ�еĸ�Ԫ�صĲ�����
 * ��ʹ������ڲ��ı��Ԫ�ص����ǰ���¶�����������ЩԪ�ص��²�����
 * 
 * ���������ݽṹ����ȶ���ϵͳ��
 * �������ݽṹ�������ڽṹ�ϵĲ������㷨��֮�����Ͻ��ѿ���ʹ�ò������Ͽ���������ɵ��ݻ���
 * Ŀ���ǰѴ�������ݽṹ���������
 */
public class TestVisitor {

	public static void main(String[] args) {
		ObjectStructure o = new ObjectStructure();
		o.attach(new Man());
		o.attach(new Woman());
		
		Success v1 = new Success();
		o.display(v1);
		Failing v2 = new Failing();
		o.display(v2);
		Amativeness v3 = new Amativeness();
		o.display(v3);
	}

}
