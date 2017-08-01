package com.assignments.lesson3_4;

public class Rectangle {
	
	private double width;
	private double length;
	
	public Rectangle(double width, double length) {
		
		this.width = width;
		this.length = length;
		
	}
	
	public double computeArea() {
		return length * width;
	}
	
	public double getWidth() {
		return width;
	}

	public double getLength() {
		return length;
	}


}
