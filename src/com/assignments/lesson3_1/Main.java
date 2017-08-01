package com.assignments.lesson3_1;

public class Main {

	public static void main(String[] args) {

		Employee employee = new Employee("Dipesh Rijal", "dipesh", 2000, 2015, 12, 07);

		Account account = new Account(employee, AccountType.CHECKING);

		account.makeDeposit(5000);

		account.makeWithdrawal(3000);

		System.out.println(account);

	}

}
