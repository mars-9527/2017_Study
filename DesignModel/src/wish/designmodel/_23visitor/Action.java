package wish.designmodel._23visitor;

/**
 * Visitor�����࣬���ݽṹ����ȶ���
 * Ϊ�ö���ṹ��ObjectStructure���еľ���Ԫ�أ�Person����ÿһ��������һ��Visit������getManConlusion��
 */
abstract class Action {
	public abstract void getManConclusion(Man m);
	public abstract void getWomanConclusion(Woman w);
}
