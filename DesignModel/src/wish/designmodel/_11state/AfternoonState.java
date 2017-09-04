package wish.designmodel._11state;

public class AfternoonState extends State {

	@Override
	public void WriteProgram(Work w) {
		if(w.getHour() < 17){
			//1.��������
			System.out.println("Time: " + w.getHour() + " -- Afternoon Work.");
		}
		else{
			//2.������һ��״̬
			w.setCurrent(new EveningState());
			w.writeProgram();
		}
	}

}
