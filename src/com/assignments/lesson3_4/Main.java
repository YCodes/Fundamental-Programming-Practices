package com.assignments.lesson3_4;

public class Main {

	public static void main(String[] args) {

		Triangle triangle = new Triangle(5.0, 6.0);
		Rectangle rectangle = new Rectangle(15.0, 10.0);
		Circle circle = new Circle(2);
		Triangle tri = new Triangle(8.0, 5.0, 6.0);

		System.out.println("Area of Triangle is " + triangle.computeArea());
		System.out.println("Area of Rectangle is " + rectangle.computeArea());
		System.out.println("Area of Circle is " + circle.computeArea());
		System.out.println("Area of Triangle is " + tri.computeArea());

	}

}
