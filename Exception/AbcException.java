package com.corejava.Exception;

//Exception Occurs Not Handled

public class AbcException {
	
	public static void main(String[] args) {
		
		System.out.println("Main Start");
		///ClassA a=new ClassB();
		try {
			System.out.println("try start");
			//ClassC c=(ClassC)a;
			 int [] arr = null;
			                
			 System.out.println(arr[2]);
		}
		catch(RuntimeException e) {
			System.out.println("NullPointerException caught: " );
		}
		System.out.println("Main Ends");
	}

}
