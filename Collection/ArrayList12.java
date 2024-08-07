package com.corejava.Collection;

import java.util.*;

public class ArrayList12 {
	
	public static void main(String[] args) {
		
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(20);
		//a.add("Hi");
		a.add(11);
		a.add(2);
		System.out.println(a);
		
		Collections.sort(a);//ascending
		System.out.println(a);
		Collections.reverse(a);//descending
		System.out.println(a);
	}

}
