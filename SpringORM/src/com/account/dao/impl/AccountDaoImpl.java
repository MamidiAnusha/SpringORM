package com.account.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.account.dao.IAccountDao;
import com.account.model.Account;

public class AccountDaoImpl implements IAccountDao {
	
	private HibernateTemplate template;
	
	

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

	@Override
	public void createAccount(Account account) {
		template.save(account);



	}

	@Override
	public void updateAccount(Account account) {
		template.update(account);
		
	}

	/*@Override
	public int deleteAccount(int accId) {
	Account account=template.get(Account.class, accId);
	if(account!=null){
		template.delete(account);
	}
		return account.getAccId();
	}*/

	@Override
	public Account loadAccount(int accId) {
		
		return template.get(Account.class, accId);
	}

	@Override
	public List<Account> getAllAccountDetails() {
		
		return template.loadAll(Account.class);
	}

	@Override
	public void deleteAccount(int accId) {
		Account acc = template.get(Account.class, accId);
		//acc.getAccId();
		template.delete(acc);
		
	}

	@Override
	public Account getAccountDetailsById(int accId) {
		Account acc = template.get(Account.class, accId);
		return acc;
	}

	

	

}
