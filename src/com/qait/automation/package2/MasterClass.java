/*Write a program which creates your own custom exception classes */


package com.qait.automation.package2;

import java.util.Scanner;

public class MasterClass {

	public static void main(String[] args) throws QaNumberValidationException, QaTextValidationException, QaIncorrectChoiceException {
		

		int number = 0;
		String stringName = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your choice choice...\nN\nT");
		String fChoice = scanner.next();
		switch (fChoice) {
		case "N":
			System.out.println("Enter your Number");
			try {
				number = scanner.nextInt();
			} catch (Exception e) {
				throw new QaNumberValidationException("QaNumberValidationException Exception thrown");
			}
			break;
		case "T":
			System.out.println("Enter your Name");
			try {
				stringName = scanner.next();
			} catch (Exception e) {
				throw new QaTextValidationException("QaTextValidationException Exception thrown");
			}
			//stringName = scanner.next();
			//System.out.println("firstChoice is ::" + stringName);
			break;
		default:
			System.out.println("You have selected out of N and T");
		}

		Operations operations = new Operations(stringName, number);
		operations.NumberOperation(number);
		Operations operations2 = new Operations(stringName);
		operations2.TextOperation(stringName);
	}

}
