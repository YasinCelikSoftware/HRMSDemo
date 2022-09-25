package kodlamaio.hrmsDemo.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrmsDemo.business.abstracts.UserEmployeeService;
import kodlamaio.hrmsDemo.core.uitilities.results.DataResult;
import kodlamaio.hrmsDemo.core.uitilities.results.Result;
import kodlamaio.hrmsDemo.entities.concretes.UserEmployee;
@RestController
@RequestMapping("/api/useremployees")
public class UserEmployeeController {
	private UserEmployeeService userEmployeeService;
	
	@Autowired
	public UserEmployeeController(UserEmployeeService userEmployeeService) {
		super();
		this.userEmployeeService = userEmployeeService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<UserEmployee>> getAll(){
		
		return this.userEmployeeService.getAll();
		
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody UserEmployee userEmployee) {
		
		return this.userEmployeeService.add(userEmployee);
		
	}
	
	@GetMapping("/getbynationalityid")
	public DataResult<UserEmployee> getByNationalityId(@RequestParam String userEmployee){
		
		return this.userEmployeeService.getByNationalityId(userEmployee);
		
	}
	
	
}
