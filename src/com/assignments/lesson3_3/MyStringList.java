package com.assignments.lesson3_3;

import java.util.Arrays;
import java.util.Iterator;


public class MyStringList {

	private final int INITIAL_LENGTH = 2;
	private String[] strArray;
	private int size;

	public MyStringList() {
		strArray = new String[INITIAL_LENGTH];
		size = 0;
	}

	public void add(String s) {	
		if (size == strArray.length - 1) {
			resize();
		}
		strArray[size] = s;
		size++;
	}

	public String get(int i) {
		return strArray[i];
	}

	public boolean find(String s) {
		
		for (String element : strArray) {
			if (element.equals(s)) {
				return true;
			}
		}
		return false;
	}

	public void insert(String s, int pos) {
		String temp[] = new String[strArray.length];
		int count = 0;
		for (int i = 0; i < strArray.length; i++) {
			if (strArray[i] != null) {
				temp[count] = strArray[i];
				count++;
			}
		}
		strArray = null;
		strArray = temp;
		if (strArray[pos] == null) {
			size++;
		}
		strArray[pos] = s;
	}

	public boolean remove(String s) {	
		
		
			for (int i = 0; i < strArray.length; i++) {
				if (strArray[i].equals(s)) {
					strArray[i] = null;
					size--;
					break;
				}
			}
			String temp[] = new String[strArray.length];
			int count = 0;
			for (int i = 0; i < strArray.length; i++) {
				if (strArray[i] != null) {
					temp[count] = strArray[i];
					count++;
				}
			}
			strArray = null;
			strArray = temp;
			
		
		return false;
	}

	private void resize() {
		System.out.println("Resizing...");		
		String temp[] = Arrays.copyOf(strArray, 2 * strArray.length);
		strArray = null;
		strArray = temp;
	}

	public String toString() {
		String toReturn = "";

		for (int i = 0; i < strArray.length; i++) {
			if (strArray[i] != null) {
				if (i == strArray.length - 1 || strArray[i + 1] == null) {
					toReturn = toReturn + strArray[i];
				} else {
					toReturn = toReturn + strArray[i] + ",";
				}
			}
		}

		return String.format("[%s]", toReturn);
	}

	public int size() {
		return size;
	}


	public static void main(String[] args) {
		MyStringList l = new MyStringList();
		l.add("Bob");
		l.add("Steve");
		l.add("Susan");
		l.add("Mark");
		l.add("Dave");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.remove("Mark");
		l.remove("Bob");
		
		
		System.out.println("The list of size " + l.size() + " is " + l);
		l.insert("Richard", 3);
		System.out.println("The list of size " + l.size() + " after inserting Richard into pos 3 is " + l);
		l.insert("Tonya", 0);
		System.out.println("The list of size " + l.size() + " after inserting Tonya into pos 0 is " + l);
	}

}
