package com.corejava.Exception;

public class ArrayIOOBException {
	public static void main(String[] args) {
		
		System.out.println("main start");
		int [] a= {1,2,3,4,5,6};
		try {
			System.out.println("try start");
			
			System.out.println(a[10]);
			System.out.println("try ends");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("AIOOBE Handled");
		}
		System.out.println("Main Ends");
	}

}
