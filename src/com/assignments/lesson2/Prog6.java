package com.assignments.lesson2;

/**
* The program removes the duplicate elements from
* the array of Strings.
*
* @author  Group 4
* @version 1.0
* @since   2017-06-1 
*/

public class Prog6 {

	public static void main(String[] args) {
		
		String[] dupsArray = {"dog", "horse", "horse", "cat", "horse","cow", "cat", "dog", "horse", "dog", "horse"};
		
		String[] bar = removeDups(dupsArray);
		for(String x: bar){
			System.out.println(x);
		}
		
	}
	
	static String[] removeDups(String[] arr) {

		String[] nonDuuplicates = new String[arr.length];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {

				for (int j = 0; j < arr.length; j++) {
					if (arr[j] != null && arr[i].equals(arr[j]) && i != j) {
						arr[j] = null;
					}
				}
				nonDuuplicates[count] = arr[i];
				count++;
			}

		}
		String[] finalNonDuplicates = new String[count];
		
		for(int k=0;k<count;k++){
			finalNonDuplicates[k]=nonDuuplicates[k];
		}
		
		return finalNonDuplicates;
	}

}
