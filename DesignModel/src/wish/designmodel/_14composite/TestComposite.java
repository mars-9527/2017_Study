package wish.designmodel._14composite;

/**
 * ���ģʽ����������ϳ����νṹ�Ա�ʾ������-���塱�Ĳ�νṹ��
 * ���ģʽʹ�õ��û��Ե����������϶����ʹ�þ���һ���ԡ�
 * 
 * ���������ֲ����������εĽṹʱ��
 * �Լ�ϣ���û����Ժ�����϶����뵥������Ĳ�ͬ��ͳһʹ����Ͻṹ�е����ж���ʱ������ʹ�����ģʽ��
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
