package com.corejava.Methods;

public class HashCode1 {
	
	String name;
	int age;
	char gender;
	
	HashCode1(String name){
		this.name=name;
	}
	
	HashCode1(String name,int age){
	    this(name);
	    this.age=age;
	}
	
	HashCode1(String name,int age,char gender){
		this(name,age);
		this.gender=gender;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name :"+name+" Age:"+age+" Gender:"+gender;
	}
	
	@Override
	public boolean equals(Object obj) {
		HashCode1 h=(HashCode1)obj;
		if(this.name==h.name && this.age==h.age && this.gender==h.gender) {
			return true;
		}
		else {
		return false;
		}
	}
	
	@Override
	public int hashCode() {
		
		return (name.hashCode()+((Integer)age).hashCode()+((Character)gender).hashCode());
	}
	
	public static void main(String[] args) {
		
		HashCode1 h=new HashCode1("vaibhav",23,'M');
		HashCode1 a=new HashCode1("Rohit",24,'M');
		
		System.out.println(h);
		System.out.println(a);
		System.out.println(h==a);
		System.out.println(a.equals(h));
		System.out.println(a.hashCode());
		System.out.println(h.hashCode());
		
	}

}
