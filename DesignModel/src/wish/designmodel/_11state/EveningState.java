package wish.designmodel._11state;

public class EveningState extends State {

	@Override
	public void WriteProgram(Work w) {
		if (w.isFinish()) {
			w.setCurrent(new RestState());
			w.writeProgram();
		} else {
			if (w.getHour() < 21) {
				System.out.println("Time: " + w.getHour() + " -- Evening Work.");
			} else {
				w.setCurrent(new SleepingState());
				w.writeProgram();
			}
		}
	}
}
