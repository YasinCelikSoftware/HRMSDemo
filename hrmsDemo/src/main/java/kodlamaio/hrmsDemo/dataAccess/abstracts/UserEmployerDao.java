package kodlamaio.hrmsDemo.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrmsDemo.entities.concretes.UserEmployer;

public interface UserEmployerDao extends JpaRepository<UserEmployer, Integer> {
	
	UserEmployer findByPhoneNumber(String phoneNumber);
}
