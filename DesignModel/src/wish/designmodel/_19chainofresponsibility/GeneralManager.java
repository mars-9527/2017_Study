package wish.designmodel._19chainofresponsibility;

public class GeneralManager extends Manager {

	public GeneralManager(String name) {
		super(name);
	}

	@Override
	public void requestApplications(Request request) {
		if(request.getRequestType().equals("leave")){
			System.out.println(name + " : " + request.getRequestContent() + " number " + request.getNumber() + " is authorized.");
		}
		else if(request.getRequestType().equals("raise") && request.getNumber() <= 500){
			System.out.println(name + " : " + request.getRequestContent() + " number " + request.getNumber() + " is authorized.");
		}
		else if(request.getRequestType().equals("raise") && request.getNumber() > 500){
			System.out.println(name + " : " + request.getRequestContent() + " number " + request.getNumber() + " is hold.");
		}
	}

}
