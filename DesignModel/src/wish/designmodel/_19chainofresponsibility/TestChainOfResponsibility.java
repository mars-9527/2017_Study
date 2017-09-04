package wish.designmodel._19chainofresponsibility;

/**
 *职责链模式，使多个对象都有机会处理请求，从而避免请求的发送者和接收者之间的耦合关系。将这些对象连成
 *一条链，并沿着这条链传递该请求，直到有一个对象处理它为止。
 *
 *在客户端配置链的顺序。
 */
public class TestChainOfResponsibility {

	public static void main(String[] args) {
		System.out.println("ok");
		//set level
		CommonManager cm = new CommonManager("level1");
		Majordomo m = new Majordomo("level2");
		GeneralManager gm = new GeneralManager("level3");
		cm.setSuperior(m);//使用父类中的setSuperior方法设置职责链顺序
		m.setSuperior(gm);
		
		//manage request
		Request request1 = new Request();
		request1.setRequestType("leave");
		request1.setRequestContent("leave request");
		request1.setNumber(2);
		cm.requestApplications(request1);//客户端的申请都是由CommonManager发起，但实际谁来决策由具体管理类来处理，客户端不知道。
		
		Request request2 = new Request();
		request2.setRequestType("leave");
		request2.setRequestContent("leave request");
		request2.setNumber(5);
		cm.requestApplications(request2);
		
		Request request3 = new Request();
		request3.setRequestType("leave");
		request3.setRequestContent("leave request");
		request3.setNumber(9);
		cm.requestApplications(request3);
		
		Request request4 = new Request();
		request4.setRequestType("raise");
		request4.setRequestContent("raise request");
		request4.setNumber(500);
		cm.requestApplications(request4);
		
		Request request5 = new Request();
		request5.setRequestType("raise");
		request5.setRequestContent("raise request");
		request5.setNumber(600);
		cm.requestApplications(request5);
		
	}

}
