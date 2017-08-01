package com.assignments.lesson2;
/**
* The program implements an application that
* displays the minimum number from array of integers. 
*
* @author  Group 4
* @version 1.0
* @since   2017-06-1 
*/
public class Prog2_8 {

	public static void main(String[] args) {
		
		int[] arr = {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
		System.out.println(min(arr));

	}
	
	static int min(int[] arrayofInts){
		int min=arrayofInts[0];
		for(int i=1;i<arrayofInts.length;i++){
			if(arrayofInts[i]<min){
				min=arrayofInts[i];
			}
		}		
		return min;
	}

}
