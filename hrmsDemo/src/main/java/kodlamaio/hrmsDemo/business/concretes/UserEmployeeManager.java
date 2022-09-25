package kodlamaio.hrmsDemo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrmsDemo.business.abstracts.UserEmployeeService;
import kodlamaio.hrmsDemo.core.uitilities.results.DataResult;
import kodlamaio.hrmsDemo.core.uitilities.results.Result;
import kodlamaio.hrmsDemo.core.uitilities.results.SuccesDataResult;
import kodlamaio.hrmsDemo.core.uitilities.results.SuccessResult;
import kodlamaio.hrmsDemo.dataAccess.abstracts.UserEmployeeDao;
import kodlamaio.hrmsDemo.entities.concretes.UserEmployee;

@Service
public class UserEmployeeManager implements UserEmployeeService {
	
	private UserEmployeeDao userEmployeeDao;
	
	
	@Autowired
	public UserEmployeeManager(UserEmployeeDao userEmployeeDao) {
		super();
		this.userEmployeeDao = userEmployeeDao;
	}

	@Override
	public DataResult<List<UserEmployee>> getAll() {
		
		
		return new SuccesDataResult<List<UserEmployee>>(this.userEmployeeDao.findAll(), "Is arayanlar listelendi.");
	}

	@Override
	public Result add(UserEmployee userEmployee) {
		this.userEmployeeDao.save(userEmployee);
		return new SuccessResult("Is arayan kayit edildi : "+ userEmployee.getName());
	}

	@Override
	public DataResult<UserEmployee> getByNationalityId(String nationalityId) {
		
		return new SuccesDataResult<UserEmployee>(this.userEmployeeDao.findByNationalityId(nationalityId));
	}

}
