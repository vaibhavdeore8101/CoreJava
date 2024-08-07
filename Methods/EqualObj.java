package com.corejava.Methods;

public class EqualObj {
	
	String name;
	int id;
	int age;
	double marks;
	
	EqualObj(String name,int id,int age,double marks){
		this.age=age;
		this.id=id;
		this.marks=marks;
		this.name=name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ID :"+id+" Name:"+name+" Age:"+age+" Marks:"+marks;
	}
	
	@Override
	public boolean equals(Object o) {
		EqualObj temp= (EqualObj)o;
		if(this.id==temp.id && this.age==temp.age && this.name==temp.name && this.marks==temp.marks) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		EqualObj a=new EqualObj("Rohit",1,24,99);
		EqualObj b=new EqualObj("Amol",2,25,96);
		EqualObj c=a;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(a==c);
		System.out.println(a.equals(b));
	}
	
	

}
