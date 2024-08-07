package com.corejava.Exception;

public class InvalidIdException extends Exception {
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Id Canot included special character";
	}

}
