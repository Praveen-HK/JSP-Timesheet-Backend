package com.jspiders.TimeSheet.Exceptions;

public class PasswordInvalidExceptions extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public PasswordInvalidExceptions ()
	{
		super(" Inavlid password,Please Enter valid Password");
	}

}
