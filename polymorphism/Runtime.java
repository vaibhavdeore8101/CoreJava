package com.corejava.polymorphism;

public class Runtime {
	
	public static void m1() {
		System.out.println("IT is runtime m1()");
	}
	
	public int run() {
		System.out.println("It is int run()");
		return run();
	}
	
	public void play() {
		System.out.println("Playing cricket");
	}

}
