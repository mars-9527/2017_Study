package wish.designmodel._09Observer;

/**
 * ����֪ͨ�߽��й�״̬�������۲��߶����ھ���֪ͨ�ߵ��ڲ�״̬�ı�ʱ�������еǼǹ��Ĺ۲��߷���֪ͨ��
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
