package com.assignments.lesson7_2;

public class Rectangle extends ClosedCurve {
	private double length;
	private double width;
	
	Rectangle(){
		super();
	}
	
	Rectangle(double width, double length){
		this.length = length;
		this.width = width;
	}
	
	@Override
	double computeArea() {
		
		return length*width;
	}
	
	
}
