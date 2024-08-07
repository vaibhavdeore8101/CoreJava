package com.corejava.Exception;

import java.util.Scanner;

public class Throw {
	
	public static void main(String[] args) {
		System.out.println("Main Start");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		if(b==0)  {
			throw new ArithmeticException("Manually");
			 
		}
		else {
			System.out.println(a/b);
		}
	}

}
