package com.corejava.Collection;

import java.util.*;

public class ArrayList13 {
	
	public static void main(String[] args) {
		
		ArrayList<Object> h=new ArrayList<Object>();
		h.add(1);
		h.add(1);
		h.add(2);
		h.add("Hello");
		h.add("Hello");
		h.add(100);
		System.out.println(h);
		
		HashSet hs=new HashSet(h);
		ArrayList a=new ArrayList(hs);
		System.out.println("Unique ArrayList:"+a);
	}

}
