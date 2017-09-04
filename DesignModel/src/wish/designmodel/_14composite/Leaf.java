package wish.designmodel._14composite;

/**
 * ����Ҷ�����Ϊ����������ӽڵ�
 */
public class Leaf extends Component {

	public Leaf(String name) {
		super(name);
	}

	@Override
	public void add(Component c) {
		System.out.println("Can not add to Leaf");
	}

	@Override
	public void remove(Component c) {
		System.out.println("Can not remove from Leaf");
	}

	@Override
	public void display(int depth) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < depth; i++){
			sb.append('-');
		}
		System.out.println(sb.toString() + name);
	}

}
