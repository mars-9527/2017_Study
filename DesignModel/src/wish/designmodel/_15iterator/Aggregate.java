package wish.designmodel._15iterator;

/**
 * �ۼ�������
 */
abstract class Aggregate {
	public abstract int getCount();
	public abstract Object get(int index);
	public abstract void set(int index, Object obj);
	public abstract Iterator createIterator();
}
