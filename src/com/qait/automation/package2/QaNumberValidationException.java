package com.qait.automation.package2;

public class QaNumberValidationException extends Exception {

	QaNumberValidationException(String message)
	{
		super(message);
		System.out.println(message);
	}
}
