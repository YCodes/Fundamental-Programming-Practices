package com.assignments.lesson6_1;

public class Exponential {
	
	private double result, finalResult;
	
	 double power(double x, int n){
		if(n==0){
			return 1;
		}
		result =x;
		finalResult =  result * power(x, n-1);
		return finalResult;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exponential exp = new Exponential();
		System.out.println(exp.power(2,4));

	}

}
