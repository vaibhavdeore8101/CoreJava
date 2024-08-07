package com.corejava.Collection;


import java.util.*;
 
public class Person implements Comparable {
	
	String name;
	double weight;
	
	Person(String name,double weight){
		this.name=name;
		this.weight=weight;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return"Name:"+name+" weight:"+weight;
	}
	
	@Override
	public boolean equals(Object obj) {
		Person temp=(Person)obj;
		if(this.name.equals(temp.name)) {
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode()+((Double)weight).hashCode();
	}
	

	@Override
	public int compareTo(Object o) {
		Person p=(Person)o;
		if(this.weight>p.weight) {
			return 1;
		}
		if(this.weight<p.weight) {
		
		return -1;
		
	}
		return 0;
	}
	
	public static void main(String[] args) {
		
	  // Person ar=new Person("va", 54);
	  // Person br=new Person("amol",54);
	  // System.out.println(ar);
	   ArrayList b= new ArrayList();
	   b.add(new Person("vaibhav",25));
	   b.add(new Person("amol", 20));
	   System.out.println(b);
	   Collections.sort(b);
	   System.out.println(b);
	   
	   
	}
	

}
