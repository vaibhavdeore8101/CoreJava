package com.corejava.Collection;

import java.util.*;

public class HashSetExample {
	public static void main(String[] args) {
		
		HashSet<Object> hs=new HashSet<>();
		hs.add(1);
		hs.add(1);
		hs.add("hii");
		hs.add(561);
		hs.add('c');
		hs.add('c');
		
		System.out.println(hs);
		System.out.println("\n Iterator to access element");
		Iterator<Object> i=hs.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("\n For Each Loop TO Access the Element");
		for(Object o:hs) {
			System.out.println(o);
		}
		
	}

}
