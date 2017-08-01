package com.assignments.lesson2;

/**
* The program displays the sum of random numbers.
* 
*
* @author  Group 4
* @version 1.0
* @since   2017-06-1 
*/

public class RandomSum {

	public static void main(String[] args) {
		
		for(int i=0;i<8;i++){
			int rand1 = (int)(Math.random()*100);
			int rand2 = (int)(Math.random()*100);
			System.out.printf("%d + %d = ", rand1, rand2);
			System.out.println(rand1+rand2);
		}
	}

}
