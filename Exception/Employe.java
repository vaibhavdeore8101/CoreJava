package com.corejava.Exception;

import java.util.Scanner;

public class Employe {
	
	String name;
	String id ;
	double salary;
	
	Employe(String name,String id,double salary) throws InvalidNameException, InvalidIdException  
	{
		if(name.charAt(0)>=97 && name.charAt(0)<=122 || name.charAt(0)>=65 && name.charAt(0)<=90) 
		{
			this.name=name;
		}
		else
		{
			throw new InvalidNameException();
		}
		if(id.charAt(0)>=97 && id.charAt(0)<=122 || id.charAt(0)>=65 && id.charAt(0)<=90 || id.charAt(0)>=48 && id.charAt(0)<=57) 
		{
            this.id = id;
			
		}
		else {
			throw new InvalidIdException();
		}
		if(salary>=0)
		{
			this.salary=salary;
			
		}
		else
		{
			throw new InvalidSalaryException();
		}
		
		
	}
	
	void display() {
		System.out.println("Emp Id:"+id+" Emp Name:"+name+" Emp Sal:"+salary);
	}
	
	public static void main(String[] args) throws InvalidNameException, InvalidIdException {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Main Start");
		System.out.println("How Many Employees Too Insert");
		int count=s.nextInt();
		Employe [] arr= new Employe[count];
		for(int i=0; i<arr.length;i++) {
			System.out.println("Enter Id:");
			String id=s.next();
			System.out.println("Enter Name:");
			String name=s.next();
			System.out.println("Enter Salary:");
			double salary=s.nextDouble();
			try {
				arr [i] = new Employe(id,name,salary);
				System.out.println("Employe Was Added");
			}
			 catch (InvalidIdException | InvalidNameException | InvalidSalaryException e) {
	                System.out.println(e.getMessage());
	                System.out.println("Employee Not Added");
	                i--; 
			}
			
			}
		for(Employe E:arr) {
			System.out.println(E);
		}
		}
	}


