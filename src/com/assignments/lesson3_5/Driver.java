package com.assignments.lesson3_5;

import java.util.Scanner;

public class Driver {

	Scanner sc = new Scanner(System.in);
	String userID;
	StoreDirectory directory;
	final String CONTINUE = "Review more options? (Y/N)";
	String n = System.getProperty("line.separator");

	public static void main(String[] args) {
		new Driver();

	}

	private String continueQuestion() {
		System.out.println(CONTINUE);
		return sc.nextLine();

	}

	Driver() {

		System.out.println("What is your Id? (An Id is a 3-digit code, like 009.)");
		String userId = sc.nextLine();
		storeId(userId);
		String n = System.getProperty("line.separator");
		String inputString = "Y";
		String outputString = null;
		displayOptions();
		while (!inputString.equalsIgnoreCase("N")) {
			inputString = sc.nextLine();

			if (inputString.equalsIgnoreCase("A")) {

				displayNumberOfBooks();

			} else if (inputString.equalsIgnoreCase("B")) {

				displayNumberOfEmployees();

			} else if (inputString.equalsIgnoreCase("C")) {
				outputString = "In Input Area, type in the employee number using this format:" + n
						+ "   add employee xxx" + n + "where 'xxx' is the 3-digit code for the employee number.";
				System.out.println(outputString);

			} else if (inputString.equalsIgnoreCase("D")) {

				outputString = "In Input Area, type in the book id number using this format:" + n + "   book xxx" + n
						+ "where 'xxx' is the 3-digit code for the employee number.";
				System.out.println(outputString);

			} else if (inputString.equalsIgnoreCase("E")) {

				outputString = "In Input Area, type in the book number using this format:" + n + "   add book xxx" + n
						+ "where 'xxx' is the 3-digit code for the book number.";
				System.out.println(outputString);

			} else if (inputString.equalsIgnoreCase("F")) {
				displayNumberOfCDsInBookstore();
			} else if (inputString.equalsIgnoreCase("G")) {

				outputString = "In Input Area, type in the cd number using this format:" + n + "   add cd xxx" + n
						+ "where 'xxx' is the 3-digit code for the cd number.";
				System.out.println(outputString);

			} else if (inputString.equalsIgnoreCase("H")) {

				outputString = "In Input Area, type in the name of the food item using this format:" + n
						+ "   food nn..." + n
						+ "where 'nn...' represents the name of the food item (like bananas or cherries).";
				System.out.println(outputString);

			} else if (inputString.trim().startsWith("add employee")) { // add
																		// employee

				int len = "add employee".length();
				addEmployee(inputString.substring(len).trim());
			} else if (inputString.trim().startsWith("add book")) { // add book

				int len = "add book".length();

				addBook(inputString.substring(len).trim());
			} else if (inputString.trim().startsWith("add cd")) { // add cd
				int len = "add cd".length();
				addCD(inputString.substring(len).trim());
			} else if (inputString.trim().startsWith("book")) { // add cd
				int len = "book".length();
				checkIfBookIsInStock(inputString.substring(len).trim());
			} else if (inputString.trim().startsWith("food")) { // add cd
				int len = "food".length();
				checkWhetherFoodItemInMarket(inputString.substring(len).trim());
			} else if (inputString.trim().equalsIgnoreCase("Y")) {
				displayOptions();
			} else if (inputString.trim().equalsIgnoreCase("N")) {
				System.out.println("Have a nice day! Bye!");
				System.exit(0);
			}

			else {
				System.out.println(n + "I did not understand your response." + n);
				displayOptions();
			}

		}

	}

	void storeId(String userID) {
		this.userID = userID;
		directory = new StoreDirectory(userID);
	}

	// this implementation has been done for you
	void displayNumberOfBooks() {
		int numbooks = directory.getNumberOfBooks();
		if (numbooks > -1) {
			System.out
					.println("Number of books is: " + numbooks + " (Look for other console messages.)" + n + CONTINUE);
		}

	}

	void displayNumberOfEmployees() {
		int numEmployees = directory.getNumberOfBookstoreEmployees();
		if (numEmployees > -1)
			System.out.println(
					"Number of employees is: " + numEmployees + " (Look for other console messages.)" + n + CONTINUE);

	}

	void addEmployee(String employeeId) {
		boolean addEmployee = directory.addNewEmployee(employeeId);
		if (addEmployee == true)
			System.out.println("Employee added unless a console message says otherwise " + n + CONTINUE);

	}

	void addBook(String bookId) {
		boolean addBook = directory.addNewBook(bookId);
		if (addBook == true)
			System.out.println("Book added unless a console message says otherwise " + n + CONTINUE);

	}

	void addCD(String cdId) {
		boolean addCd = directory.addNewCD(cdId);
		if (addCd == true)
			System.out.println("CD added unless a console message says otherwise " + n + CONTINUE);

	}

	void checkIfBookIsInStock(String bookId) {
		boolean bookInStock = directory.bookIsInStock(bookId);
		if (bookInStock == true)
			System.out.println("Yes, book with bookId " + bookId + " is in stock." + " (Look for console messages.)" + n
					+ CONTINUE);

	}

	void displayNumberOfCDsInBookstore() {
		int numberOfcd = directory.getNumCDsInBookstore();

		if (numberOfcd > 0)
			System.out.println("Number of CD's is " + numberOfcd + " (Look for console messages.)" + n + CONTINUE);

	}

	void checkWhetherFoodItemInMarket(String foodItem) {
		boolean foodExists = directory.marketCarriesFoodItem(foodItem);
		if (foodExists == true)
			System.out.println("Yes the market carries " + foodItem + n + CONTINUE);

	}

	void displayOptions() {
		String n = System.getProperty("line.separator");
		String display = "TYPE A LETTER IN INPUT AREA TO MAKE A SELECTION" + n + n
				+ "A. Learn how many books are in bookstore." + n + "B. Learn how many employees are in bookstore." + n
				+ "C. Add an employee to the bookstore." + n + "D. See if a book is in stock in the bookstore." + n
				+ "E. Add a book to the bookstore." + n + "F. Get number of CD's in the bookstore." + n
				+ "G. Add a new CD to the bookstore's stock." + n
				+ "H. See if the market carries a particular food item." + n + "N. Exit the system.";
		System.out.println(display);

	}

}
