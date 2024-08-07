package com.corejava.Collection;

//Array Exception Handle

import java.util.*;

public class ArrayException1 {
	
	public static void main(String[] args) {
		
		ArrayList ar=new ArrayList();
		ar.add(100);
		ar.add("Hi");
		ar.add(1233);
		ar.add(true);
		ar.add(233.21);
		//System.out.println(ar);
		
		Iterator i=ar.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		try {
			System.out.println(i.next());
		}
		catch(NoSuchElementException e) {
			System.out.print("Elements are not available to fetch");
		}
	}

}
