package com.corejava.Collection;

import java.util.*;

public class BookTreeSet {
	String name;
	double price;
	
	public BookTreeSet(String name,double price) {
		this.name=name;
		this.price=price;
	}
	
	public static void main(String[] args) {
		
	TreeSet t=new TreeSet();
	t.add(new Book("java", 65));
	t.add(new Book("python", 689));
	t.add(new Book("c++", 321));
	t.add(new Book("c", 34));
	t.add(new Book("java", 6));
	System.out.println(t);
	
	Iterator i=t.iterator();
	while (i.hasNext()) {
		System.out.println(i.next());
		
	}}

}
