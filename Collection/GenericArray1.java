package com.corejava.Collection;

import java.util.*;

public class GenericArray1 {
	
	String name;
	int pages;
	public GenericArray1(String name,int pages) {
		this.name=name;
		this.pages=pages;
		
		
		}
	
	@Override
	public String toString() {
		return "Book Name:"+name+"Pages:"+pages;
	}
	
	
	
	public static void main(String[] args) {
		
		ArrayList<GenericArray1> book=new ArrayList<GenericArray1>();
		book.add(new GenericArray1("Java",450));
		book.add(new GenericArray1("python", 245));
		book.add(new GenericArray1("c++",287));
		book.add( new GenericArray1("c",300));
		System.out.println();
		System.out.println(book);
		
	}

}
