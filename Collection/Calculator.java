package com.corejava.Collection;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("inter the number");
		int aa=sc.nextInt();
		System.out.println("inter the second number");
		int b=sc.nextInt();
		System.out.println("=============");
		String in=sc.next();
		
		if(in.equals("+")) {
			System.out.println(aa+b);
			
		}else if(in.equals("-")) {
			System.out.println(aa-b);
		}else if(in.equals("*")) {
		System.out.println(aa*b);
		}else if(in.equals("%")) {
			System.out.println(aa%b);
		}else {
			System.out.println("use valid operator");
		}
	}
}
