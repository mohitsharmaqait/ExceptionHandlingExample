package com.qait.automation.package2;

public class Operations {

	public int number;
	public String name;

	Operations(String name, int number) {
		number = this.number;
		name = this.name;
	}

	Operations(String name) {
		name = this.name;
	}

	Operations(int number) {
		number = this.number;

	}

	public void NumberOperation(int number) {
		
		int sqrt = (int) Math.sqrt(number);
		if (sqrt * sqrt == number) {

			System.out.println(number + " Number is a perfect square");

		} else {

			System.out.println(number + " Number is NOT a perfect square");

		}

	}
}