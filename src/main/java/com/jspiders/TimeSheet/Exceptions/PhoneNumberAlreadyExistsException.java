package com.jspiders.TimeSheet.Exceptions;

public class PhoneNumberAlreadyExistsException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PhoneNumberAlreadyExistsException() {
		super("Phone Number Already Exists");
	}
}
