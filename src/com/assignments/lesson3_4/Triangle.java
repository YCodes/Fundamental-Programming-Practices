package com.assignments.lesson3_4;

public class Triangle {

	private double base;
	private double height;

	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	public Triangle(double s1, double s2, double s3) {

		double[] sides = { s1, s2, s3 };

		double max = sides[0];

		for (double d : sides) {

			if (d > max) {
				max = d;
			}

		}

		base = max;
		double perimeter = (s1 + s2 + s3) / 2;
		double area = Math.sqrt(perimeter * (perimeter - s1) * (perimeter - s2) * (perimeter - s3));

		height = (2 * area) / base;
	}

	public double computeArea() {
		return 0.5 * base * height;
	}

	public double getBase() {
		return base;
	}

	public double getHeight() {
		return height;
	}

}
