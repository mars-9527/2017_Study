package wish.designmodel._07facade;

class Facade {
	SubSystemOne one;
	SubSystemTwo two;
	SubSystemThree three;
	SubSystemFour four;
	
	public Facade(){
		one = new SubSystemOne();
		two = new SubSystemTwo();
		three = new SubSystemThree();
		four = new SubSystemFour();
	}
	
	public void methodA(){
		System.out.println("\nMehtod Group A --- ");
		one.methodOne();
		two.methodTwo();
		four.methodFour();
	}
	
	public void methodB(){
		System.out.println("\nMehtod Group B --- ");
		one.methodOne();
		three.methodThree();
		//four.MethodFour();
	}
}
