package wish.designmodel._08builder;

/**
 * ������ģʽ��������ģʽ����һ�����Ӷ���Ĺ��������ı�ʾ���룬ʹ��ͬ���Ĺ������̿��Դ�����ͬ�ı�ʾ��
 */
public class TestBuilder {
	//�ͻ��˲���֪������Ľ������
	public static void main(String[] args) {
		Director director = new Director();
		Builder b1 = new ConcreteBuilder1();
		Builder b2 = new ConcreteBuilder2();
		
		director.Construct(b1);//ָ��b1��ɽ���
		Product p1 = b1.getResult();//���ؽ���Ĳ�Ʒ
		p1.Show();
		
		director.Construct(b2);
		Product p2 = b2.getResult();
		p2.Show();
	}

}
