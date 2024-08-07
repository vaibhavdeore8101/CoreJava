package com.corejava.String;

public class Demo {
	
	public static void main(String[] args) {
		
	
	String s="hello";
	String s1="hello";
	
	System.out.println(s);     //print hello==> toString() overriden
	System.out.println(s==s1);  //true ==> Object are created in scp and same reference is returned.
	
	String s2=new String("hello");
	System.out.println(s1==s2);   //false
	System.out.println(s1.equals(s2)); // true=> equals(obj) overridean
	
	String name="vaibhav";
	String name1=new String("vaibhav");  
	System.out.println(name.hashCode()); // same hascode() is overridean
	System.out.println(name1.hashCode());// same hascode() is overridean


	}
}

	
