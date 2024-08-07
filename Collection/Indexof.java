package com.corejava.Collection;

//
import java.util.*;
public class Indexof {
	
	public static void main(String[] args) {
		
		ArrayList ar=new ArrayList();
		ar.add(100);
		ar.add("Hi");
		ar.add(1233);
		ar.add(true);
		ar.add(233.21);
		System.out.println(ar);
		
		System.out.println(ar.indexOf("Hi"));
		System.out.println(ar.lastIndexOf(1233));
		System.out.println(ar.indexOf(56));
	}

}
