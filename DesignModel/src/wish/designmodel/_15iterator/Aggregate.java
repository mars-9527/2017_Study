package wish.designmodel._15iterator;

/**
 * ¾Û¼¯³éÏóÀà
 */
abstract class Aggregate {
	public abstract int getCount();
	public abstract Object get(int index);
	public abstract void set(int index, Object obj);
	public abstract Iterator createIterator();
}
