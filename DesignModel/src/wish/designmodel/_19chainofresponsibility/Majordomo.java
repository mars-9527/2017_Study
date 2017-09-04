package wish.designmodel._19chainofresponsibility;

public class Majordomo extends Manager {

	public Majordomo(String name) {
		super(name);
	}

	@Override
	public void requestApplications(Request request) {
		if(request.getRequestType().equals("leave") && request.getNumber() <= 5){
			System.out.println(name + " : " + request.getRequestContent() + " number " + request.getNumber() + " is authorized.");
		}
		else{
			if(superior != null){
				superior.requestApplications(request);
			}
		}
	}

}
