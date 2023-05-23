package com.jspiders.TimeSheet.Exceptions;

public class EmailAlreadyExistsException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EmailAlreadyExistsException() {
		super("Email Already Registred");
	}
}
