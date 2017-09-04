package wish.designmodel._11state;

/**
 * ״̬ģʽ����һ�����������״̬�ı�ʱ����ı�����Ϊ����������������Ǹı������ࡣ
 * 
 * ״̬ģʽ��Ҫ������ǣ�������һ������״̬ת�����������ʽ���ڸ���ʱ���������״̬��
 * �ж��߼�ת�Ƶ���ʾ��ͬ״̬��һϵ���൱�У����԰Ѹ��ӵ��ж��߼��򻯡�
 * 
 * ���������Ӵ��������֧��䣬�����׵������µ�״̬��ת����
 * 
 * ��һ���������Ϊȡ��������״̬��������������*����ʱ��*����״̬�ı�������Ϊʱ������ʹ��״̬ģʽ��
 */
class Work {
	private State current;
	private boolean finish;
	private double hour;

	public Work(){
		current = new ForenoonState();//������ʼ״̬
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
	 * ÿ�ζ��Ǵӳ�ʼ״̬��ʼ������ֱ�������ɴ���ľ���State��
	 */
	public void writeProgram(){
		current.WriteProgram(this);/////*****
	}
}
