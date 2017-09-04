package wish.designmodel._11state;

public class AfternoonState extends State {

	@Override
	public void WriteProgram(Work w) {
		if(w.getHour() < 17){
			//1.处理请求
			System.out.println("Time: " + w.getHour() + " -- Afternoon Work.");
		}
		else{
			//2.设置下一个状态
			w.setCurrent(new EveningState());
			w.writeProgram();
		}
	}

}
