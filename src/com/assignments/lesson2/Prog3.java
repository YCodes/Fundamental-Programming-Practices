package com.assignments.lesson2;

/**
* The program cast the sum of float numbers to integers
* and also rounds the sum to the nearest integer.
* @author  Group 4
* @version 1.0
* @since   2017-06-1 
*/

public class Prog3 {

	public static void main(String[] args) {
		
		float numOne = 1.27f, numTwo = 3.881f, numThree = 9.6f;
		float sum;
		sum = numOne + numTwo + numThree;
		System.out.println("Sum of numbers: " + (int) sum);
		System.out.println("Round sum of numbers: " + Math.round(sum));
	}

}