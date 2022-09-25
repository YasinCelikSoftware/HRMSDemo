package kodlamaio.hrmsDemo.business.abstracts;

import java.util.List;



import kodlamaio.hrmsDemo.core.uitilities.results.DataResult;
import kodlamaio.hrmsDemo.core.uitilities.results.Result;
import kodlamaio.hrmsDemo.entities.concretes.UserEmployer;

public interface UserEmployerService {
	
	DataResult<List<UserEmployer>> getAll();
	Result add(UserEmployer userEmployer);
	DataResult<UserEmployer> getByPhoneNumber(String phoneNumber);
}
