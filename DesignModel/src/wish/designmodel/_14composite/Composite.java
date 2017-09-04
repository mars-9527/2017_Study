package wish.designmodel._14composite;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

/**
 * ����֦�ڵ���Ϊ���ɴ洢֦�ڵ��Ҷ�ڵ�
 */
public class Composite extends Component {
	private List<Component> children = new ArrayList<Component>();

	public Composite(String name) {
		super(name);
	}

	@Override
	public void add(Component c) {
		children.add(c);
	}

	@Override
	public void remove(Component c) {
		children.remove(c);
	}

	@Override
	public void display(int depth) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < depth; i++){
			sb.append('-');
		}
		System.out.println(sb.toString() + name);
		
		Iterator<Component> iterator = children.iterator();
		while(iterator.hasNext()){
			((Component)(iterator.next())).display(depth + 2);
		}
	}

}
