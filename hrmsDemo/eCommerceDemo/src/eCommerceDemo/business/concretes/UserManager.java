package eCommerceDemo.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerceDemo.business.abstracts.UserService;
import eCommerceDemo.core.abstracts.RegisterService;
import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;
	private RegisterService registerService;

	public UserManager(UserDao userDao, RegisterService registerService) {

		this.userDao = userDao;
		this.registerService = registerService;
	}

	@Override
	public void userRegister(User user) {
		Pattern pattern = Pattern.compile("[\\w-]{1,20}@\\w{2,20}.\\w{2,3}$");
		Matcher matcher = pattern.matcher(user.getEmail());
		
		if (user.getPassword().length() >= 6 && user.getName().length() >= 2 && user.getLastName().length() >= 2 && matcher.matches()==true) {
			this.userDao.add(user);
			
		} else {

			System.out.println("Eksik tuslama yaptiniz.");

		}
	}
	
	public void googleRegister(User user) {
		
		this.registerService.registerToSystem(user.getEmail());
		
	}

}
