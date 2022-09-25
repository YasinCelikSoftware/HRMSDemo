package kodlamaio.hrmsDemo.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrmsDemo.entities.concretes.User;

public interface UserDao extends JpaRepository<User, Integer> {
	
	User getByEmail(String email);
}
