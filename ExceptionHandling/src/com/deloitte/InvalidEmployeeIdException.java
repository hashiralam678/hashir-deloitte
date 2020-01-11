package com.deloitte;

public class InvalidEmployeeIdException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1511944099696161146L;

	public InvalidEmployeeIdException(String message) {
		super(message);
	}

}