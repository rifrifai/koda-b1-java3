package com.collections;

import java.util.ArrayList;

public class Employee {
	private String accountID;
	private String name;
	private double balance;

	public Employee(String accountID, String name, double balance) {
		if (accountID == null || accountID.isBlank()) {
			throw new IllegalArgumentException("Account ID must exist");
		}
		if (name == null || name.isBlank()) {
			throw new IllegalArgumentException("Name must exist");
		}
		if (balance < 0) {
			throw new IllegalArgumentException("Balance must exist");
		}

		this.accountID = accountID;
		this.name = name;
		this.balance = balance;
	}

	public String getAccountID() {
		return accountID;
	}
	public String getName() {
		return name;
	}
	public double getBalance() {
		return balance;
	}
}
