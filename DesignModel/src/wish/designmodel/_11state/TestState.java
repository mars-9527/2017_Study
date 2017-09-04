package wish.designmodel._11state;

public class TestState {

	public static void main(String[] args) {
		Work w = new Work();
		w.setHour(9);
		w.writeProgram();
		
		w.setHour(12.5);
		w.writeProgram();
		
		w.setHour(15);
		w.writeProgram();
		
		//w.setFinish(true);
		w.setFinish(false);
		
		w.setHour(20);
		w.writeProgram();
		
		w.setHour(23);
		w.writeProgram();
	}

}
