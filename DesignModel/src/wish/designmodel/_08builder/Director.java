package wish.designmodel._08builder;

/**
 * ָ�����࣬�ǹ���һ��ʹ��Builder�ӿڵĶ�������ָ�ӽ�����̡�
 */
class Director {
	public void Construct(Builder builder){
		builder.buildPartA();
		builder.buildPartB();
	}
}
