package com.corejava.Collection;

import java.util.ArrayList;

//addAll(Collection)

public class ArrayList3 {
	
	public static void main(String[] args) {
		
		ArrayList arr3=new ArrayList<>();
		arr3.add(100);
		arr3.add(200);
		arr3.add(300);
		arr3.add("Hello");
		arr3.add("true");
		System.out.println(arr3);
		
		ArrayList ar2=new ArrayList();
		ar2.add(55);
		ar2.add(arr3);
		System.out.println(ar2);
		System.out.println(ar2.size());
		
	}

}
