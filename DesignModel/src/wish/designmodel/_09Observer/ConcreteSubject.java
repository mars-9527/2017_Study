package wish.designmodel._09Observer;

/**
 * 具体通知者将有关状态存入具体观察者对象；在具体通知者的内部状态改变时，给所有登记过的观察者发出通知。
 */
class ConcreteSubject extends Subject {
	private String subjectState;

	public String getSubjectState() {
		return subjectState;
	}

	public void setSubjectState(String subjectState) {
		this.subjectState = subjectState;
	}
}
