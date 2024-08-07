package com.corejava.Methods;

public class toString {
	
	int pages;
	String name;
	
	toString(int pages,String name){
		this.pages=pages;
		this.name=name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name :"+name+" Pages :"+pages;
	}
	
	
	public static void main(String[] args) {
		toString java =new toString(1888,"Java");
		toString python=new toString(4578,"Python");
		
		System.out.println(java);
		System.out.println(python);
		
	}

}
