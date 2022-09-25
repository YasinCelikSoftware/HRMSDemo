package eCommerceDemo;

import eCommerceDemo.business.abstracts.UserService;
import eCommerceDemo.business.concretes.UserManager;
import eCommerceDemo.core.concretes.GoogleRegisterManagerAdapter;
import eCommerceDemo.dataAccess.concretes.ManuelUserDao;
import eCommerceDemo.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		UserService userService = new UserManager(new ManuelUserDao(),new GoogleRegisterManagerAdapter());
		
		User user = new User("Yasin", "Celik", "yasincelik@hotmail.com", "1234567");
		userService.userRegister(user);
		
	}

}
