package com.assignments.lesson2;

/**
* The program implements an application that
* reverses the input string.
*
* @author  Group 4
* @version 1.0
* @since   2017-06-1 
*/

import java.util.Scanner;

public class Prog5 {

	public static void main(String[] args) {
		
		String result = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Word: ");
		String value = sc.nextLine();
		sc.close();
		for(int i=(value.length()-1);i>=0;i--){
			result += value.charAt(i);
		}
		System.out.println(result);
	}

}
