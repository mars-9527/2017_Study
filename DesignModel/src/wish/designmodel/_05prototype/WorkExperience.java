package wish.designmodel._05prototype;

class WorkExperience implements Cloneable {//1.WorkExperienceʵ��Cloneable�ӿ�
	
	private String workDate;
	private String company;
	
	public String getWorkDate() {
		return workDate;
	}
	public void setWorkDate(String workDate) {
		this.workDate = workDate;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	public Object Clone(){//2.WorkExperienceʵ��Clone����
		try {
			return (Object)this.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
}
