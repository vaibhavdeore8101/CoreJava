package com.corejava.Collection;

//remove(int)

import java.util.ArrayList;

public class ArrayList4 {
	public static void main(String[] args) {
		
		ArrayList ar4=new ArrayList();
		ar4.add(10);
		ar4.add(20);
		ar4.add(30);
		ar4.add("HII");
		ar4.add("Java");
		System.out.println(ar4);
		ar4.remove(2);
		System.out.println(ar4);
//		ar4.remove(10);
		ar4.remove((Integer)20);
		ar4.remove((String)"HII");
		System.out.println(ar4);
		
		
	}

}
