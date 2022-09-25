package kodlamaio.hrmsDemo.business.abstracts;


import kodlamaio.hrmsDemo.core.uitilities.results.Result;
import kodlamaio.hrmsDemo.entities.concretes.User;

public interface UserService {
	
	boolean checkIfEmailAlreadyExists(String email);
	

}
