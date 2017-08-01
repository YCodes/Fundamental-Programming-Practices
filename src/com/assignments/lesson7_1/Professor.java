package com.assignments.lesson7_1;

import java.time.LocalDate;

public class Professor extends DeptEmployee {
	private int numberOfPublications;
	
	public Professor() {
		super();
		numberOfPublications = 0;
	}
	
	Professor(String firstName, String lastName, double salary, LocalDate hireDate, int numberOfPublications) {
		super(firstName, lastName, salary, hireDate);
		this.numberOfPublications = numberOfPublications;
	}

	public int getNumberOfPublications() {
		return numberOfPublications;
	}

	public void setNumberOfPublications(int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}

}
