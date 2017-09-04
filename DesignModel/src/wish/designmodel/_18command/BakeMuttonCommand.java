package wish.designmodel._18command;

public class BakeMuttonCommand extends Command {

	public BakeMuttonCommand(Barbecuer receiver) {
		super(receiver);
	}

	@Override
	public void ExcuteCommand() {
		receiver.BakeMutton();
	}

}
