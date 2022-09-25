package kodlamaio.hrmsDemo.business.abstracts;

import java.util.List;

import kodlamaio.hrmsDemo.core.uitilities.results.DataResult;
import kodlamaio.hrmsDemo.core.uitilities.results.Result;
import kodlamaio.hrmsDemo.entities.concretes.UserEmployee;

public interface UserEmployeeService {
	
	DataResult<List<UserEmployee>> getAll();
	
	Result add(UserEmployee userEmployee);
	
	DataResult<UserEmployee> getByNationalityId(String nationalityId);
}
