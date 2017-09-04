package wish.designmodel._05prototype;

/**
 * ԭ��ģʽ��ԭ��ʵ��ָ��������������࣬����ͨ��������Щԭ�ʹ����µĶ��󡣣�ǳ���ƺ���ƣ�
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
