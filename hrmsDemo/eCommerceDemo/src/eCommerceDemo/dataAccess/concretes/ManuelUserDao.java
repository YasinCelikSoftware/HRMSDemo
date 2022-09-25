package eCommerceDemo.dataAccess.concretes;

import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.entities.concretes.User;

public class ManuelUserDao implements UserDao {

	@Override
	public void add(User user) {
		
		System.out.println("Manuel olarak kaydedildi : " + user.getName());
		
	}

}
