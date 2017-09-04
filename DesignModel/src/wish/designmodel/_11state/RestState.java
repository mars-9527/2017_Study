package wish.designmodel._11state;

public class RestState extends State {

	@Override
	public void WriteProgram(Work w) {
			System.out.println("Time: " + w.getHour() + " -- Out Of Work.");
	}

}
