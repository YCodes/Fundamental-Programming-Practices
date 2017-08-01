package com.assignments.lesson4_0;

public class Main {

	public static void main(String[] args) {
		Car car = new Car();
		Car.Tire cartire = car.new Tire(3.2f);
		System.out.println(cartire.radius());
	}

}
