package wish.designmodel._18command;

/**
 * 命令模式，将一个请求封装为一个对象，从而使你可用不同的请求对客户进行参数化；对请求排队或
 * 记录请求日志，以及支持可撤销的操作。
 * 
 * 容易地设计命令队列、记录命令日志、允许接收请求的一方决定是否要否决请求、实现对请求的撤销和重做、
 * 加进新类很容易并不影响其他类、把请求一个操作的对象与知道怎么执行一个操作的对象分割开。
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
