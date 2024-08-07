package com.corejava.Collection;

//For each Loop

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList9 {
	
	public static void main(String[] args) {
		
		ArrayList ar=new ArrayList();
		ar.add(100);
		ar.add("Hi");
		ar.add(1233);
		ar.add(true);
		ar.add(233.21);
		System.out.println(ar);
		
		for(Object o:ar) {
			System.out.println(o);
		}
	}

}
