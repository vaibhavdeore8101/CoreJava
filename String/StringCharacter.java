package com.corejava.String;
import java.util.Scanner;

public class StringCharacter {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s="Java IS Object Oriented Programming Language";
		System.out.println(s);
		int Count=0;
		System.out.println("Enter The Caracter To Count");
		char a=sc.next().charAt(0);
		for(int i=0;i<=s.length()-1;i++) {
			if(s.charAt(i)== a) {
				Count++;
			}
			
		}
		System.out.println(Count);
	}

}
