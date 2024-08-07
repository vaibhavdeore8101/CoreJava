package com.corejava.Collection;

//hasNext() and Next()
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList8 {
	
	public static void main(String[] args) {
		
		ArrayList ar=new ArrayList();
		ar.add(100);
		ar.add("Hi");
		ar.add(1233);
		ar.add(true);
		ar.add(233.21);
		System.out.println(ar);
		
		Iterator i=ar.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
			
		}
	}

}
