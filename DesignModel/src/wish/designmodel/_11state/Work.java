package wish.designmodel._11state;

/**
 * 状态模式，当一个对象的内在状态改变时允许改变其行为，这个对象看起来像是改变了其类。
 * 
 * 状态模式主要解决的是，当控制一个对象状态转换的条件表达式过于复杂时的情况。把状态的
 * 判断逻辑转移到表示不同状态的一系列类当中，可以把复杂的判断逻辑简化。
 * 
 * 可以消除庞大的条件分支语句，很容易地增加新的状态和转换。
 * 
 * 当一个对象的行为取决于它的状态，并且它必须在*运行时刻*根据状态改变它的行为时，可以使用状态模式。
 */
class Work {
	private State current;
	private boolean finish;
	private double hour;

	public Work(){
		current = new ForenoonState();//设置起始状态
	}

	public State getCurrent() {
		return current;
	}

	public double getHour() {
		return hour;
	}

	public boolean isFinish() {
		return finish;
	}
	public void setCurrent(State current) {
		this.current = current;
		//writeProgram();
	}
	public void setFinish(boolean finish) {
		this.finish = finish;
	}
	
	public void setHour(double hour) {
		this.hour = hour;
	}
	
	/**
	 * 每次都是从初始状态开始遍历，直到遇到可处理的具体State类
	 */
	public void writeProgram(){
		current.WriteProgram(this);/////*****
	}
}
