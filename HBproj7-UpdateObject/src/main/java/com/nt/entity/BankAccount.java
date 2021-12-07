package com.nt.entity;

import java.io.Serializable;

public class BankAccount implements Serializable{
	private long acno;
	private String holderName;
	private float balance;
	
	public BankAccount() {
		System.out.println("BankeAccount:: 0-paramconstructor");
	}

	public long getAcno() {
		return acno;
	}

	public void setAcno(long acno) {
		this.acno = acno;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "BankAccount [acno=" + acno + ", holderName=" + holderName + ", balance=" + balance + "]";
	}
}
