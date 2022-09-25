package eCommerceDemo.business.abstracts;

import eCommerceDemo.entities.concretes.User;

public interface UserService {
	void userRegister(User user);
	void googleRegister(User user);
}
