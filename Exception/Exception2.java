package com.corejava.Exception;


//Handled NullPointer & Arrayindex Exception

public class Exception2 {
	
	public static void main(String[] args) {
		
		System.out.println("Main Start");
		int []a= {1,2,3,4,5,6};
		
		try {
			System.out.println("Try Start");
			System.out.println(a[100]);
			System.out.println("try Ends");
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("AIOOBE Handled");
		}
		System.out.println("Main Ends");
		
       // catch(NullPointerException e) {
        //	System.out.println("NPE Handled");
        //}
		
	}

}
