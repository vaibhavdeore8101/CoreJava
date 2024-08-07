package com.corejava.Exception;

public class MulException {
	
	public static void main(String[] args) throws StringIndexOutOfBoundsException {
		System.out.println("Main Start");
		String s="Hello";
		try {
			System.out.println(s.charAt(100));
		}
		
		
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("Exception1 Handled");
		}
		
		catch(RuntimeException e) {
			System.out.println("Exception Handled");
		}
		
		
	}

	public String getMessage() {
		// TODO Auto-generated method stub
		return null;
	}

}
