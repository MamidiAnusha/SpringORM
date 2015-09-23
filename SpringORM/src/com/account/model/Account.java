package com.account.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="accTab")
public class Account {
	
	@Id
	@Column(name="aid")
	private int accId;
	@Column(name="aname")
	private String accName;
	@Column(name="abal")
	private double accBal;
	
	
	public Account() {
		super();
	}


	public int getAccId() {
		return accId;
	}


	public void setAccId(int accId) {
		this.accId = accId;
	}


	public String getAccName() {
		return accName;
	}


	public void setAccName(String accName) {
		this.accName = accName;
	}


	public double getAccBal() {
		return accBal;
	}


	public void setAccBal(double accBal) {
		this.accBal = accBal;
	}


	@Override
	public String toString() {
		return "Account [accId=" + accId + ", accName=" + accName + ", accBal=" + accBal + "]";
	}
	
	
	
	

}
