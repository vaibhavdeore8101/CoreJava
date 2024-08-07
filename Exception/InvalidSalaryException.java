package com.corejava.Exception;

public class InvalidSalaryException extends RuntimeException {
	
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Salary Cannot be Neagativ or zero";
	}

}
