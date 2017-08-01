package com.assignments.lesson7_1;

import java.time.LocalDate;

public class DeptEmployee {
	private String firstName;
	private String lastName;
	private double salary;
	private LocalDate hireDate;
	
	DeptEmployee(){
		firstName = "Not_Available";
		lastName = "Not_Available";
		salary = 00.00;
		hireDate = hireDate.of(1990, 01, 01);
	}
	
	DeptEmployee(String firstName, String lastName, double salary, LocalDate hireDate){
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.hireDate = hireDate;	
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LocalDate getHireDate() {
		return hireDate;
	}
	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}
	
	public double computeSalary(){
		return salary;
	}
	

}
