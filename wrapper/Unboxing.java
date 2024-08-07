package com.corejava.wrapper;

public class Unboxing {
	public static void main(String[] args) {
		
		Integer i=10;//autoboxing-->Integer.value(10)
		//unboxing
		int a=i.intValue();
		System.out.println(a);
		
		//auto-unboxing
		int a2=i; //i..intvalue()-> by compiler
		System.out.println(a2);
		
		float F=i.floatValue();
		System.out.println(F);
		
		double d=i.doubleValue();
		System.out.println(d);
	}

}
