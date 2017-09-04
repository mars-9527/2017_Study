package wish.designmodel._11state;

public class NoonState extends State {

	@Override
	public void WriteProgram(Work w) {
		if(w.getHour() < 13){
			System.out.println("Time: " + w.getHour() + " -- Noon Rest.");
		}
		else{
			w.setCurrent(new AfternoonState());
			w.writeProgram();
		}
	}

}
