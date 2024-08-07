package com.corejava.Exception;

public class Student {
	String name;
	int age;
	
	public Student(String name,int age)throws InvalidNameException,InvalidAgeException {
		
		if(name.charAt(0)>=97 && name.charAt(0)<=122 ||name.charAt(0)>=65 && name.charAt(0)<=90) 
		{
			this.name=name;
		}
		else {
			throw new InvalidNameException();
		}
		if(age>0 && age<100) {
			this.age=age;
		}
		else {
			throw new InvalidAgeException();
		}
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name;"+name+" Age:"+age;
	}

}
