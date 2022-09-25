package kodlamaio.hrmsDemo.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrmsDemo.business.abstracts.UserEmployerService;
import kodlamaio.hrmsDemo.core.uitilities.results.DataResult;
import kodlamaio.hrmsDemo.core.uitilities.results.Result;
import kodlamaio.hrmsDemo.entities.concretes.UserEmployer;
@RestController
@RequestMapping("/api/useremployers")
public class UserEmployerController {
	private UserEmployerService userEmployerService;

	public UserEmployerController(UserEmployerService userEmployerService) {
		super();
		this.userEmployerService = userEmployerService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<UserEmployer>> getAll(){
		
		return this.userEmployerService.getAll();
		
	} 
	
	@PostMapping("/add")
	public Result add(@RequestBody UserEmployer userEmployer) {
		
		return this.userEmployerService.add(userEmployer);
		
	}
	
	@GetMapping("/getbyphonenumber")
	public DataResult<UserEmployer> getByPhoneNumber(String phoneNumber){
		
		return this.userEmployerService.getByPhoneNumber(phoneNumber);
	}
}
