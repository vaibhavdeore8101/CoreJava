package com.corejava.Exception;

//try With Multiple Catch Box

public class Exception1 {
	
	public static void main(String[] args) {
		
		System.out.println("Main Start");
		int [] a= {1,2,3,4,5,6,2,3};
		try {
			System.out.println("try Starts");
			System.out.println(a[20]);
			System.out.println("try Ends");
		}
		
		//catch(NullPointerException e) {
			//System.out.println("NPE Handled");
		//}
		
		catch(ClassCastException e){
			System.out.println("CCE Handled");
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("AIOOBE Handled");
		}
		
		
	}

}
