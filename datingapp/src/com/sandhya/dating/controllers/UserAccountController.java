package com.sandhya.dating.controllers;

import com.sandhya.dating.dao.UserAccountDAO;
import com.sandhya.dating.dao.UserAccountDAOImpl;
import com.sandhya.dating.model.Interest;
import com.sandhya.dating.model.UserAccount;

public class UserAccountController {

	public static void main(String[] args) {

		UserAccountController controller = new UserAccountController();
//		controller.registerUser();
//		controller.findAllUsers();
		controller.findMatchingUsers();
	}
	
	public void registerUser() {
		UserAccountDAO dao = new UserAccountDAOImpl();
		UserAccount userAccount = new UserAccount() ;
		userAccount.setId(1);
		userAccount.setAge(30);
		userAccount.setCity("Austin");
		userAccount.setCountry("USA");
		userAccount.setEmail("a@b.com");
		userAccount.setGender("M");
		userAccount.setPassword("password");
		userAccount.setPhoneNumber("123456890");
		Interest interest = new Interest();
		interest.setId(1);
		interest.setLikes("watching movies");
		interest.setHobbies("playing game");
		userAccount.setInterest(interest);
		dao.save(userAccount );
		System.out.println(dao.findById(1));
	}
	
	public void findAllUsers() {
		UserAccountDAO dao = new UserAccountDAOImpl();
		createUsers(dao);
		
//		dao.delete(1);
		
		System.out.println(dao.findAll());
		System.out.println(dao.findById(2));
	}
	
	public void findMatchingUsers() {
		UserAccountDAO dao = new UserAccountDAOImpl();
		createUsers(dao);
		
		System.out.println(dao.findMatches(30, "Austin"));
	}

	private void createUsers(UserAccountDAO dao) {
		UserAccount userAccount = new UserAccount() ;
		userAccount.setId(1);
		userAccount.setUserName("Sandhya");
		userAccount.setAge(22);
		userAccount.setCity("Austin");
		userAccount.setCountry("USA");
		userAccount.setEmail("a@b.com");
		userAccount.setGender("M");
		userAccount.setPassword("password");
		userAccount.setPhoneNumber("123456890");
		Interest interest = new Interest();
		interest.setId(1);
		interest.setLikes("watching movies");
		interest.setHobbies("playing game");
		userAccount.setInterest(interest);
		dao.save(userAccount );
		
		
		
		UserAccount userAccount2 = new UserAccount() ;
		userAccount2.setId(2);
		userAccount2.setUserName("Rani");
		userAccount2.setAge(30);
		userAccount2.setCity("Austin");
		userAccount2.setCountry("USA");
		userAccount2.setEmail("a@b.com");
		userAccount2.setGender("M");
		userAccount2.setPassword("password");
		userAccount2.setPhoneNumber("123456890");		
		dao.save(userAccount2 );
	}
	
	
	
	
}
