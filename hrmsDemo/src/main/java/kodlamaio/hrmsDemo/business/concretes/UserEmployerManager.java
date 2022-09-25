package kodlamaio.hrmsDemo.business.concretes;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrmsDemo.business.abstracts.UserEmployerService;
import kodlamaio.hrmsDemo.business.abstracts.UserService;
import kodlamaio.hrmsDemo.core.uitilities.results.DataResult;
import kodlamaio.hrmsDemo.core.uitilities.results.ErrorResult;
import kodlamaio.hrmsDemo.core.uitilities.results.Result;
import kodlamaio.hrmsDemo.core.uitilities.results.SuccesDataResult;
import kodlamaio.hrmsDemo.core.uitilities.results.SuccessResult;
import kodlamaio.hrmsDemo.dataAccess.abstracts.UserEmployerDao;
import kodlamaio.hrmsDemo.entities.concretes.User;
import kodlamaio.hrmsDemo.entities.concretes.UserEmployer;

@Service
public class UserEmployerManager implements UserEmployerService {
	private UserEmployerDao userEmployerDao;
	private UserService userService;
	
	
	@Autowired
	public UserEmployerManager(UserEmployerDao userEmployerDao, UserService userService) {
		super();
		this.userEmployerDao = userEmployerDao;
		this.userService = userService;
	}

	@Override
	public DataResult<List<UserEmployer>> getAll() {
		
		
		return new SuccesDataResult<List<UserEmployer>>(this.userEmployerDao.findAll(), "Is verenler listelendi.");
	}

	@Override
	public Result add(UserEmployer userEmployer) {
		
		boolean emailCheck = userService.checkIfEmailAlreadyExists(userEmployer.getEmail());
		
		if(!emailCheck == false) {
			
			
			return new ErrorResult("Email already exists.");
			
		}
		else {
			
			this.userEmployerDao.save(userEmployer);
			return new SuccessResult("Registiration completed succesfully : "+ userEmployer.getEmail());
			
		}
	}

	@Override
	public DataResult<UserEmployer> getByPhoneNumber(String phoneNumber) {
		
		return new SuccesDataResult<UserEmployer>(this.userEmployerDao.findByPhoneNumber(phoneNumber));
	}
	
}
