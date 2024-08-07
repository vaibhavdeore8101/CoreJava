package com.corejava.abstractionInterface;

//Multiple Inheritance

public class Demo implements Int1,Int2 {
	
	public void m1() {
		
		System.out.println("From Int1");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("From Int2");
		
	}
	
	public static void main(String[] args) {
		Demo d= new Demo();
		d.m1();
		d.m2();
	}

}
