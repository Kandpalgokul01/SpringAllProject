package com.masai.Dao;

import com.masai.model.Account;

public interface AccountDao {

	
	
	public boolean createAccount(Account account);
	
	public boolean deleteAccount(int accno);
	
	public boolean updateAccount(Account acc);
	
	public Account findAccount(int accno);
}
