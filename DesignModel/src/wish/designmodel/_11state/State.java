package wish.designmodel._11state;

abstract class State {
	public abstract void WriteProgram(Work w);//处理请求，并设置下一个状态
}
