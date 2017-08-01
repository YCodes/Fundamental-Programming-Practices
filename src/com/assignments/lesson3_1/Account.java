package com.assignments.lesson3_1;

class Account {
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private AccountType acctType;
	private Employee employee;	

	Account(Employee emp, AccountType acctType, double balance) {
		this.acctType = acctType;
		this.balance = balance;
		this.employee = emp;
	}

	Account(Employee emp, AccountType acctType) {
		this(emp, acctType, DEFAULT_BALANCE);
	}
	
	public double getBalance() {
		return balance;
	}

	public AccountType getAcctType() {
		return acctType;
	}

	@Override
	public String toString() {
		return "Account [balance=" + balance + ", acctType=" + acctType + ", employee=" + employee + "]";
	}

	// public String toString() {
	// return "type = " + acctType + ", balance = " + balance;
	// }

	public void makeDeposit(double deposit) {
		// updates the balance field
		balance += deposit;
	}

	public boolean makeWithdrawal(double amount) {
		// updates the balance field and returns true, unless
		// withdrawal amount is too large; in that case,
		// it does not modify the balance field, and returns false
		if (amount < balance) {
			balance -= amount;
			return true;
		}

		return false;
	}
}