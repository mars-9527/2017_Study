package wish.designmodel._18command;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Waiter {
	private List<Command> orders = new ArrayList<Command>();
	
	public void setOrder(Command cmd){//�������Ŷӻ��¼������־
		if(cmd.toString() == "BakeChickenWingCommand"){
			System.out.println("No Chicken Wing");
		}
		else{
			orders.add(cmd);
			System.out.println("Add bill: " + cmd.toString() + "Time: " + (new Date()));
		}
	}
	
	public void CancelOrder(Command cmd){//��������
		orders.remove(cmd);
		System.out.println("Remove bill: " + cmd.toString() + "Time: " + (new Date()));
	}
	
	public void excuteAll(){
		Iterator<Command> iterator = orders.iterator();
		while(iterator.hasNext()){
			iterator.next().ExcuteCommand();
		}
	}
}
