package wish.designmodel._19chainofresponsibility;

/**
 *ְ����ģʽ��ʹ��������л��ᴦ�����󣬴Ӷ���������ķ����ߺͽ�����֮�����Ϲ�ϵ������Щ��������
 *һ���������������������ݸ�����ֱ����һ����������Ϊֹ��
 *
 *�ڿͻ�����������˳��
 */
public class TestChainOfResponsibility {

	public static void main(String[] args) {
		System.out.println("ok");
		//set level
		CommonManager cm = new CommonManager("level1");
		Majordomo m = new Majordomo("level2");
		GeneralManager gm = new GeneralManager("level3");
		cm.setSuperior(m);//ʹ�ø����е�setSuperior��������ְ����˳��
		m.setSuperior(gm);
		
		//manage request
		Request request1 = new Request();
		request1.setRequestType("leave");
		request1.setRequestContent("leave request");
		request1.setNumber(2);
		cm.requestApplications(request1);//�ͻ��˵����붼����CommonManager���𣬵�ʵ��˭�������ɾ���������������ͻ��˲�֪����
		
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
