package com.corejava.Collection;

import java.util.*;

public class Book implements Comparable {
	
	String name;
	int pages;
	
	Book(String name,int pages){
		this.name=name;
		this.pages=pages;
	}
	

	@Override
	public int compareTo(Object o) {
		Book temp=(Book)o;
		if(this.pages>temp.pages) {
			return 1;
		}
		if(this.pages<temp.pages) {
			return -1;
		}
		return 0;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Book Name:"+name+" pages:"+pages;
	}
	
	@Override
	public boolean equals(Object obj) {
		Book B=(Book)obj;
		if(this.name==B.name && this.pages==B.pages) {
			return true;
		}
		else {
		return false;
	}
	}
	
	public static void main(String[] args) {
		
		ArrayList a=new ArrayList<>();
		a.add(new Book("java",100));
		a.add(new Book("python",300));
		a.add(new Book("c++",654));
		System.out.println(a);
		
		System.out.println("Collection Sorting");
		Collections.sort(a);
		System.out.println(a);
		
		Book [] ar= {new Book("java",200),new Book("python",20),new Book("c++",650)};
		System.out.println("arrays Sort:");
		Arrays.sort(ar);
		for(Book e:ar) {
			System.out.println(e);
		}
	}
	
	
	}
