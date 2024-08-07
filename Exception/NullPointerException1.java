package com.corejava.Exception;

//NullPointer(RUNTIME) Exception Handle
public class NullPointerException1 {
	
	static void check(String s) {
		System.out.println("check start");
		try {
			System.out.println(s.length());
		}
		catch(RuntimeException e) {
			System.out.println("NPE Handle");
		}
		System.out.println("check ends");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Main start");
		check(null);
		System.out.println("main ends");
	}

}
