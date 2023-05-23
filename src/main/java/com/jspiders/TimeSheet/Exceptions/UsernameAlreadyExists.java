package com.jspiders.TimeSheet.Exceptions;

public class UsernameAlreadyExists extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UsernameAlreadyExists()
	{
		super("UserName Already Exists");
	}
}
