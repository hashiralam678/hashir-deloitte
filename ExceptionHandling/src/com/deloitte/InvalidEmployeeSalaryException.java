package com.deloitte;

public class InvalidEmployeeSalaryException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3478079859870948412L;

	public InvalidEmployeeSalaryException(String message) {
		super(message);
	}
}
