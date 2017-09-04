package wish.designmodel._11state;

public class ForenoonState extends State {

	@Override
	public void WriteProgram(Work w) {
		if(w.getHour() < 12){
			System.out.println("Time: " + w.getHour() + " -- Forenoon Work.");
		}
		else{
			w.setCurrent(new NoonState());
			w.writeProgram();
		}
	}

}
