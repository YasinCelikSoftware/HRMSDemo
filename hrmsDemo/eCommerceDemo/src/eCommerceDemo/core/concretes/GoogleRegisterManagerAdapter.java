package eCommerceDemo.core.concretes;

import eCommerceDemo.core.abstracts.RegisterService;
import eCommerceDemo.googleRegister.GoogleRegisterManager;


public class GoogleRegisterManagerAdapter implements RegisterService {

	@Override
	public void registerToSystem(String message) {
		
		GoogleRegisterManager manager = new GoogleRegisterManager();
		manager.register(message);
		
	}
	
	

}
