package com.account.dao;

import java.util.List;

import com.account.model.Account;

public interface IAccountDao {
	
	public void createAccount(Account account);
	public void updateAccount(Account account);
	public void deleteAccount(int accId);
	public Account loadAccount(int accId);
    public List<Account> getAllAccountDetails();
    public Account getAccountDetailsById(int accId);
}
