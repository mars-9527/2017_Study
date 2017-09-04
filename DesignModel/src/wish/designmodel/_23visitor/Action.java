package wish.designmodel._23visitor;

/**
 * Visitor抽象类，数据结构相对稳定。
 * 为该对象结构（ObjectStructure）中的具体元素（Person）的每一个类声明一个Visit操作（getManConlusion）
 */
abstract class Action {
	public abstract void getManConclusion(Man m);
	public abstract void getWomanConclusion(Woman w);
}
