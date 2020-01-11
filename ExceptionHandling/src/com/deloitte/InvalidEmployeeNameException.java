package com.deloitte;

public class InvalidEmployeeNameException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7718836484913333922L;

	public InvalidEmployeeNameException(String message) {
		super(message);
	}

}
