package wish.designmodel._05prototype;

/**
 * 原型模式用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。（浅复制和深复制）
 */
public class TestPrototype {

	public static void main(String[] args) {
		Resume a = new Resume("Big");
		a.SetPersonalInfo("male", "27");
		a.SetWorkExperience("2008-07-25", "Foxconn");
		
		Resume b = (Resume)a.Clone();
		b.SetWorkExperience("2012-07-25", "Foxconn");
		
		Resume c = (Resume)a.CloneDeep();
		c.SetWorkExperience("2013-11-01", "Foxconn");
		
		a.Display();
		b.Display();
		c.Display();
	}

}
