package com.assignments.lesson2;

/**
* The program splits the string using split function to 
* show the desired output and data are accessed from Data.java file. 
*
* @author  Group 4
* @version 1.0
* @since   2017-06-1 
*/

public class Prog4 {

	public static void main(String[] args) {
		
		String myString = Data.records;
		String[] stringRows = myString.split(":");
		for(String x: stringRows){
			System.out.println(x.split(",")[0]);
		}
		
//			for(int i=0;i<stringRows.length;i++){
//				String value = stringRows[i];
//				String[] splitValue = value.split(",");
//				System.out.println(splitValue[0]);
//			}
	}

}
