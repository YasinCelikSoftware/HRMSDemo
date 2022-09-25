package kodlamaio.hrmsDemo.business.concretes;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrmsDemo.business.abstracts.JobPositionService;
import kodlamaio.hrmsDemo.core.uitilities.results.DataResult;
import kodlamaio.hrmsDemo.core.uitilities.results.ErrorResult;
import kodlamaio.hrmsDemo.core.uitilities.results.Result;
import kodlamaio.hrmsDemo.core.uitilities.results.SuccesDataResult;
import kodlamaio.hrmsDemo.core.uitilities.results.SuccessResult;
import kodlamaio.hrmsDemo.dataAccess.abstracts.JobPositionDao;
import kodlamaio.hrmsDemo.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService {
	
	private JobPositionDao jobPositionDao;
	
	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}

	@Override
	public DataResult<List<JobPosition>> getAll() {
		
		return new SuccesDataResult<List<JobPosition>>(this.jobPositionDao.findAll(), "İş pozisyonları listelendi.");
	}



	 
	  @Override 
	  public DataResult<JobPosition> getByPositionName(String positionName) {
	  
	  return new SuccesDataResult<JobPosition>(this.jobPositionDao.findByPositionName(positionName), "Pozisyon bulundu."); 
	  }
	 

	@Override
	public Result add(JobPosition jobPosition) {
		boolean jobPositionCheck = checkJobPosition(jobPosition.getPositionName());
		if (jobPositionCheck == true){
			
			return new ErrorResult("Job position already exists.");
			
		}
		this.jobPositionDao.save(jobPosition);
		return new SuccessResult("Is pozisyonu kayit edildi : " + jobPosition.getPositionName());
	}
	
	private boolean checkJobPosition(String jobPositionName) {
		
		JobPosition jobPosition = this.jobPositionDao.findByPositionName(jobPositionName);
		if(jobPosition != null) {
			return true;
		}
		else {
			return false;
		}
		
	}

	

}
