package com.assignments.lesson3_2;

import java.time.LocalDate;

public class Employee {

	private String name;
	private LocalDate hireDate;
	private Account checking;
	private Account savings;
	private Account retirement;

	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
		this.name = name;
		hireDate = LocalDate.of(yearOfHire, monthOfHire, dayOfHire);
	}

	public void createNewChecking(double startAmount) {
		checking = new Account(this, AccountType.checkingAcct, startAmount);
	}

	public void createNewSavings(double startAmount) {
		savings = new Account(this, AccountType.savingsAcct, startAmount);
	}

	public void createNewRetirement(double startAmount) {
		retirement = new Account(this, AccountType.retirementAcct, startAmount);
	}

	public void deposit(AccountType acctType, double amt) {
		if (acctType.equals(AccountType.savingsAcct)) {
			savings.makeDeposit(amt);

		} else if (acctType.equals(AccountType.checkingAcct)) {

			checking.makeDeposit(amt);

		} else if (acctType.equals(AccountType.retirementAcct)) {

			retirement.makeDeposit(amt);

		}
	}

	public boolean withdraw(AccountType acctType, double amt) {

		boolean value = false;

		if (acctType.equals(AccountType.savingsAcct)) {
			value  = savings.makeWithdrawal(amt);

		} else if (acctType.equals(AccountType.checkingAcct)) {

			value = checking.makeWithdrawal(amt);

		} else if (acctType.equals(AccountType.retirementAcct)) {

			value = retirement.makeWithdrawal(amt);

		}

		return value;
	}

	public String getFormattedAcctInfo() {
		
		String format = String.format("%nACCOUNT INFO FOR %s: %n %n", this.name);
		
		if (checking != null) {

			format += String.format("Account type: %s %nCurrent bal: %.1f %n", AccountType.checkingAcct.toString()
					.toLowerCase(), checking.getBalance());
		}

		if (savings != null) {

			format += String.format("Account type: %s %nCurrent bal: %.1f %n", AccountType.savingsAcct.toString()
					.toLowerCase(), savings.getBalance());
		}

		if (retirement != null) {

			format += String.format("Account type: %s %nCurrent bal: %.1f %n", AccountType.retirementAcct.toString()
					.toLowerCase(), retirement.getBalance());
		}

		return format;
	}

	public String getName() {
		return name;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

}
