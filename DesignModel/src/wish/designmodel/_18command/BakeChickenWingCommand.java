package wish.designmodel._18command;

public class BakeChickenWingCommand extends Command {

	public BakeChickenWingCommand(Barbecuer receiver) {
		super(receiver);
	}

	@Override
	public void ExcuteCommand() {
		receiver.BakeChickenWing();
	}

}
