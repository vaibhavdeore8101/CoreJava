package com.corejava.wrapper;

public class Boxing {
	
	public static void main(String[] args) {
		
		int a=10;
		Integer i=Integer.valueOf(a);
		System.out.println(i);
		
		Integer e=a;
		System.out.println(e);
		
		Integer o=(Integer)a;
		System.out.println(o);
	}

}
