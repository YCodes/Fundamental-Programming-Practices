package com.assignments.lesson7_1;

import java.time.LocalDate;

public class Secretary extends DeptEmployee {
	private double overtimeHours;
	
	Secretary() {
		super();
		overtimeHours = 0;
	}
	
	Secretary(String firstName, String lastName, double salary, LocalDate hireDate, double overtimeHours){
		super(firstName, lastName, salary, hireDate);
		this.overtimeHours = overtimeHours;
	}

	public double getOvertimeHours() {
		return overtimeHours;
	}

	public void setOvertimeHours(double overtimeHours) {
		this.overtimeHours = overtimeHours;
	}
	
	@Override
	public double computeSalary() {
		// TODO Auto-generated method stub
		return super.computeSalary() + 12*overtimeHours;
	}
	
}
