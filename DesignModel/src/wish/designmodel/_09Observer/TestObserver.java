package wish.designmodel._09Observer;

/**
 * 观察者模式定义了一种一对多的依赖关系，让多个观察者对象同时监听某一个主题对象。
 * 这个主题对象在状态发生变化时，会通知所有观察者对象，使它们能够自动更新自己。
 * 
 * 观察者模式中抽象通知者依赖抽象观察者，且每个具体观察者不一定都是要调用update()方法，
 * 使用委托，通知者和观察者可以互不知道，由客户端来决定通知谁，可解决以上问题。
 */
class TestObserver {

	public static void main(String[] args) {
		ConcreteSubject s = new ConcreteSubject();
		
		s.attach(new ConcreteObserver(s, "X"));
		s.attach(new ConcreteObserver(s, "Y"));
		
		s.setSubjectState("aaa");
		s.noticeAll();
	}

}
