package kodlamaio.hrmsDemo.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrmsDemo.entities.concretes.UserEmployee;

public interface UserEmployeeDao extends JpaRepository<UserEmployee, Integer>{
	
	UserEmployee findByNationalityId(String nationalityId);
}
