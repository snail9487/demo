package com.example.demo.entity;

public class TaipeiBank {

	private String branch;

	private String user;

	private int balance = 1000;

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int saving(int money) {
		if (money > 0) {
			balance = balance + money;
		}
		return balance;
	}

	public int withdraw(int money) {
		if (money > 0 && money <= balance) {
			balance = balance - money;
		}
		return balance;
	}

}
