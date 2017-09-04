package wish.designmodel._18command;

/**
 * ����ģʽ����һ�������װΪһ�����󣬴Ӷ�ʹ����ò�ͬ������Կͻ����в��������������Ŷӻ�
 * ��¼������־���Լ�֧�ֿɳ����Ĳ�����
 * 
 * ���׵����������С���¼������־��������������һ�������Ƿ�Ҫ�������ʵ�ֶ�����ĳ�����������
 * �ӽ���������ײ���Ӱ�������ࡢ������һ�������Ķ�����֪����ôִ��һ�������Ķ���ָ��
 */
public class TestCommand {

	public static void main(String[] args) {
		//prepair
		Barbecuer boy = new Barbecuer();
		Command bakeMuttonCmd1 = new BakeMuttonCommand(boy);
		Command bakeMuttonCmd2 = new BakeMuttonCommand(boy);
		Command bakeChickenWingCmd = new BakeChickenWingCommand(boy);
		Waiter girl = new Waiter();
		
		//start
		girl.setOrder(bakeMuttonCmd1);
		girl.setOrder(bakeMuttonCmd2);
		girl.setOrder(bakeChickenWingCmd);
		
		//excute
		girl.excuteAll();
	}

}
