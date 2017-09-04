package wish.designmodel._05prototype;

class Resume implements Cloneable {
	private String name;
	private String sex;
	private String age;
	private WorkExperience work;
	
	public Resume(String name){
		this.name = name;
		work = new WorkExperience();
	}
	
	//3.ΪClone�����ṩ˽�й�����
	private Resume(WorkExperience work){
		this.work = (WorkExperience)work.Clone();
	}
	
	public void SetPersonalInfo(String sex, String age){
		this.sex = sex;
		this.age = age;
	}
	public void SetWorkExperience(String workDate, String company){
		work.setWorkDate(workDate);
		work.setCompany(company);
	}
	
	public void Display(){
		System.out.println(name + " " + sex + " " + age);
		System.out.println("Work Experience: " + work.getWorkDate() + " " + work.getCompany());
	}
	
	public Object Clone(){//ǳ���ơ���������work�����ã�ÿ���µ�Resume������һ��work�����ã�
		try {
			return (Object)this.clone();//�������clone�����������¶���hashCode��ԭ����һ����
										//�����ò�ͬ�������е����������ֶ�ʹ����ͬ�����á�
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public Object CloneDeep(){//4.���WorkExperience��������
		Resume obj = new Resume(this.work);
		obj.name = this.name;
		obj.sex = this.sex;
		obj.age = this.age;
		return obj;
	}
	
}
