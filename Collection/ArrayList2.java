package com.corejava.Collection;

//Merge One Array To Another Array
//add(Object)

import java.util.ArrayList;
public class ArrayList2 {

	public static void main(String[] args) {
		
		ArrayList a1=new ArrayList();
		a1.add(100);
		a1.add(200);
		a1.add(300);
		System.out.println(a1);
		System.out.println(a1.size());
		
		ArrayList a2=new ArrayList ();
		a2.add(10);
		a2.add(20);
		System.out.println(a2);
		
		System.out.println("After Merge Two Arrayss");
		a2.add(a2);
		System.out.println(a2);
		System.out.println(a2.size());
	}
}
