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
	
	//3.为Clone方法提供私有构造器
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
	
	public Object Clone(){//浅复制。（复制了work的引用，每个新的Resume对象共用一个work的引用）
		try {
			return (Object)this.clone();//对象调用clone方法产生的新对象，hashCode与原对象不一样，
										//即引用不同，但其中的引用类型字段使用相同的引用。
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public Object CloneDeep(){//4.完成WorkExperience对象的深复制
		Resume obj = new Resume(this.work);
		obj.name = this.name;
		obj.sex = this.sex;
		obj.age = this.age;
		return obj;
	}
	
}
