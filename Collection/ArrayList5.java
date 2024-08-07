package com.corejava.Collection;

//remove all(Collection) and retainall(Collection)
import java.util.ArrayList;

public class ArrayList5 {
	
	public static void main(String[] args) {
		
		ArrayList ar5=new ArrayList();
		ar5.add(10);
		ar5.add(20);
		ar5.add(30);
		ar5.add(40);
		ar5.add("Hello");
		ar5.add("true");
		System.out.println(ar5);
		
		ArrayList a2=new ArrayList();
		a2.add(10);
		a2.add("Hello");
		a2.add(30);
		System.out.println(a2);
		
		//ar5.retainAll(a2);
		System.out.println(ar5);
		
		//ar5.removeAll(a2);
		System.out.println(ar5);
		
		ar5.retainAll(a2);
		System.out.println(ar5);
	}

}
