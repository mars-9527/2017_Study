package wish.designmodel._08builder;

/**
 * ���������࣬ȷ����Ʒ����������PartA��PartB��ɣ�
 * ������һ���õ���Ʒ��������ķ���GetResult��
 * 
 * ���彨���߸��ݳ������߹涨�ı�׼������Product��
 */
abstract class Builder {
	public abstract void buildPartA();
	public abstract void buildPartB();
	public abstract Product getResult();
}
