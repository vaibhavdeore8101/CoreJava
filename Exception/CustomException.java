package com.corejava.Exception;

import java.security.InvalidKeyException;

public class CustomException extends MulException {
	
	public String getmessage() {
		return "Not a valid hello";

	}
	
      public static void main(String[] args) {
		System.out.println("Main Start");
		String s="Hello";
		if(s.equals("Hell")) {
			System.out.println("It is Valid");
		}
		else {
			try {
				throw new InvalidKeyException() ;
			}
			catch(InvalidKeyException e) {
				System.out.println(e.getMessage());
				
			}
			System.out.println("Main Ends");
		}
	}

}
