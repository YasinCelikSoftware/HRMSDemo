package kodlamaio.hrmsDemo.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrmsDemo.business.abstracts.JobPositionService;
import kodlamaio.hrmsDemo.core.uitilities.results.DataResult;
import kodlamaio.hrmsDemo.core.uitilities.results.Result;
import kodlamaio.hrmsDemo.entities.concretes.JobPosition;

@RestController
@RequestMapping("/api/jobpositions")

public class JobPositionController {
	
	private JobPositionService jobPositionService;
	
	
	@Autowired
	public JobPositionController(JobPositionService jobPositionService) {
		super();
		this.jobPositionService = jobPositionService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobPosition>> getAll(){
		
		return this.jobPositionService.getAll();
		
	}
	
	@GetMapping("/getbyname")
	public DataResult<JobPosition> getByPositionName(@RequestParam String positionName) {
		
		return this.jobPositionService.getByPositionName(positionName);
		
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobPosition jobPosition) {
		
		return this.jobPositionService.add(jobPosition);
		
	}
	
	
	
	//
}
