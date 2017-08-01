package com.assignments.lesson4_0;

public class Car {
	private float area;

	class Tire {
		private float circumference;

		Tire(float circumference) {
			this.circumference = circumference;
		}

		public float radius() {
			return area = (float) (circumference / (2 * Math.PI));
		}
	}
}
