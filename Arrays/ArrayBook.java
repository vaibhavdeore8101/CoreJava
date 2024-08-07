package com.corejava.Arrays;

public class ArrayBook {
	
	String name;
	int pages;
	
	ArrayBook(String name,int pages){
		this.name=name;
		this.pages=pages;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Book Name :"+name+" Book Pages :"+pages;
	}
	
	public static void main(String[] args) {
		
		ArrayBook [] AB=new ArrayBook[3];
		ArrayBook a1=new ArrayBook("Java",500);
		ArrayBook a2=new ArrayBook("Python",4450);
		ArrayBook a3=new ArrayBook("Sql",320);
		AB[0]=a1;
		AB[1]=a2;
		AB[2]=a3;
		
		for(int i=0;i<AB.length;i++) {
			System.out.println(AB[i]);
		}
	}

}
