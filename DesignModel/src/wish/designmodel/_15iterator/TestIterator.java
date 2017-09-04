package wish.designmodel._15iterator;

/**
 * 迭代器模式，提供一种方法顺序访问一个聚合对象中各个元素，而又不暴露该对象的内部表示。
 * 
 * 迭代器模式分离了集合对象的遍历行为，抽象出一个迭代器类来负责，这样既可以做到不暴露集合的内部结构，
 * 又可让外部代码透明地访问集合内部的数据。
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
