package com.sandhya.dating.dao;

import java.util.List;

import com.sandhya.dating.model.UserAccount;

public interface UserAccountDAO {

	public void save(UserAccount userAccount);

	UserAccount findById(int id);

	List<UserAccount> findAll();

	List<UserAccount> findMatches(int age, String city);
	
	void delete(int id);
}
