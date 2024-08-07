package com.corejava.Exception;
//Exception Occurs And Handled

import java.util.Scanner;

public class ArithematicExceptionHandle {
	
	public static void main(String[] args) {
		
		System.out.println("Main Start");
		Scanner sc =new Scanner(System.in);
		int a=10;
		int b=0;
		try {
		System.out.println(a/b);
		}
		catch(ArithmeticException  e) {
			System.out.print("Denominator CanNot Zero");
		}
		System.out.println("Main Ends");
	}

}
