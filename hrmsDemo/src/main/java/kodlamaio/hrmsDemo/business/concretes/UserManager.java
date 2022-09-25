package kodlamaio.hrmsDemo.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrmsDemo.business.abstracts.UserService;
import kodlamaio.hrmsDemo.core.uitilities.results.Result;
import kodlamaio.hrmsDemo.core.uitilities.results.SuccessResult;
import kodlamaio.hrmsDemo.dataAccess.abstracts.UserDao;
import kodlamaio.hrmsDemo.entities.concretes.User;
@Service
public class UserManager implements UserService {
	
	private UserDao userDao;
	
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}
	
	public UserManager() {}

	@Override
	public boolean checkIfEmailAlreadyExists(String email) {
		
		User user = this.userDao.getByEmail(email);
		
		if(user != null) {
			
			return true;
			
		}
		else {
			
			return false;
			
		}
		
	}
}
