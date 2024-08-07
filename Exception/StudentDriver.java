package com.corejava.Exception;

import java.util.Scanner;

public class StudentDriver  {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("How Many Student");
		int a=sc.nextInt();
		Student [] ar=new Student[a];
		System.out.println("Enter The Details");
		for(int i=0;i<=ar.length;i++) 
		{
			System.out.println("Enter The Name");
			String name=sc.next();
			System.out.println("Enter The Age");
			int age=sc.nextInt();
			try {
				ar[i]=new Student(name,age);
				System.out.println("Student Was Added");
			}
			catch (InvalidNameException e) 
			{
				System.out.println(e.getMessage());
				System.out.println("Student Was Not Added");
				i--;
			}
			catch( InvalidAgeException e) {
				System.out.println(e.getMessage());
				System.out.println("Studen was not added");
				i--;
			}
			 catch (ArrayIndexOutOfBoundsException e) {
	                System.out.println("No more space for students. Exiting input loop.");
	                break; // Exit the input loop
		}
		System.out.println("Student Added");
		for(Student e1:ar) {
			System.out.println(e1);
		}
	}

	}
}
