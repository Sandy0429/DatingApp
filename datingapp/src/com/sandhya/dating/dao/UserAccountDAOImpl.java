package com.sandhya.dating.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sandhya.dating.model.UserAccount;

public class UserAccountDAOImpl implements UserAccountDAO {

	Map<Integer, UserAccount> userAccounts = new HashMap<>(); //use it as a DB for now

	@Override
	public void save(UserAccount userAccount) {
		userAccounts.put(userAccount.getId(), userAccount);
	}

	@Override
	public UserAccount findById(int id) {
		return userAccounts.get(id);
	}

	@Override
	public List<UserAccount> findAll() {
		return new ArrayList<UserAccount>(userAccounts.values());
	}

	@Override
	public List<UserAccount> findMatches(int age, String city) {
		Collection<UserAccount> accounts = userAccounts.values();
		ArrayList<UserAccount> matches = new ArrayList<UserAccount>();
		
		for(UserAccount userAccount : accounts){
			if(userAccount.getAge() == age && userAccount.getCity().equals(city)) {
				matches.add(userAccount);
			}
			
		}
		
		return matches;
	}

	@Override
	public void delete(int id) {
		userAccounts.remove(id);
	}

	
}
