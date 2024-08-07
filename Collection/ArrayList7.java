package com.corejava.Collection;

import java.util.ArrayList;

//get(int index)

public class ArrayList7 {
	
	public static void main(String[] args) {
		
		ArrayList ar5=new ArrayList();
		ar5.add(10);
		ar5.add(20);
		ar5.add(30);
		ar5.add(40);
		ar5.add("Hello");
		ar5.add("true");
		System.out.println(ar5);
		System.out.println(ar5.get(2));//for fetch
		for(int i=0;i<ar5.size();i++) {
			System.out.print(ar5.get(i));
		}
	}

}
