package wish.designmodel._11state;

public class SleepingState extends State {

	@Override
	public void WriteProgram(Work w) {
		System.out.println("Time: " + w.getHour() + " -- Can Not Hold Sleeping.");
	}

}
