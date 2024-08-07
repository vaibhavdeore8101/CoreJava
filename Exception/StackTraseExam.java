package com.corejava.Exception;

public class StackTraseExam {
	
	static void m1() {
		//m2();
	}
	
	public static void main(String[] args) {
		
		System.out.println("Main Start");
		 try {
	            int[] arr = new int[3];
	            System.out.println(arr[5]); // This will throw an ArrayIndexOutOfBoundsException
	        } 
		 catch (ArrayIndexOutOfBoundsException e) {
	            // Print the stack trace to see where the exception occurred
	            e.printStackTrace();
	        }
		System.out.println("Main Ends");
	}
	static void m2() {
		//System.out.println(10/0);
	}

}
