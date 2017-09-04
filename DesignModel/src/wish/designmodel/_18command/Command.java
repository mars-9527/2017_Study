package wish.designmodel._18command;

public abstract class Command {
	protected Barbecuer receiver;
	
	public Command(Barbecuer receiver){
		this.receiver = receiver;
	}
	
	public abstract void ExcuteCommand();
	
	public String toString(){
		return this.getClass().getName();
	}
}
