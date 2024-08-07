package com.corejava.Exception;

public class InvalidAgeException extends Exception {
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Age Can Not Be Negative Or Greater Than 100";
	}

}
