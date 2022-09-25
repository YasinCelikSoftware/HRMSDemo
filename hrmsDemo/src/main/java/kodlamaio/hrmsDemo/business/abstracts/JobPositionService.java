package kodlamaio.hrmsDemo.business.abstracts;

import java.util.List;

import kodlamaio.hrmsDemo.core.uitilities.results.DataResult;
import kodlamaio.hrmsDemo.core.uitilities.results.Result;
import kodlamaio.hrmsDemo.entities.concretes.JobPosition;


public interface JobPositionService {
	
	DataResult<List<JobPosition>> getAll();
	Result add(JobPosition jobPosition);
	DataResult<JobPosition> getByPositionName(String positionName);
	

}
