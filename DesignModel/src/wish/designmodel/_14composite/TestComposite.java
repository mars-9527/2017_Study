package wish.designmodel._14composite;

/**
 * 组合模式，将对象组合成树形结构以表示“部分-整体”的层次结构。
 * 组合模式使用得用户对单个对象和组合对象的使用具有一致性。
 * 
 * 需求中体现部分与整体层次的结构时，
 * 以及希望用户可以忽略组合对象与单个对象的不同，统一使用组合结构中的所有对象时，可以使用组合模式。
 */
public class TestComposite {

	public static void main(String[] args) {
		Composite root = new Composite("root");
		root.add(new Leaf("Leaf A"));
		root.add(new Leaf("Leaf B"));
		
		Composite comp = new Composite("Composite X");
		comp.add(new Leaf("Leaf XA"));
		comp.add(new Leaf("Leaf XB"));
		
		//comp.display(1);
		
		root.add(comp);
		
		Composite comp2 = new Composite("Composite XY");
		comp2.add(new Leaf("Leaf XYA"));
		comp2.add(new Leaf("Leaf XYB"));
		
		comp.add(comp2);
		
		root.add(new Leaf("Leaf C"));
		
		Leaf leaf = new Leaf("Leaf D");
		root.add(leaf);
		root.remove(leaf);
		
		//leaf.add(new Leaf("Leaf E"));
		
		root.display(1);
	}

}
