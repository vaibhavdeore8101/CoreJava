package com.corejava.abstraction;

public class Nano extends Car {
	
	void start() {
		System.out.println("Nano Started");
	}
	
	void stop() {
		System.out.println("Nano Stopped");
	}
	
	void shiftgears() {
		System.out.println("Nano gears Shifted");
	}
	
	public static void main(String[] args) {
		
		Nano n=  new Nano();
		n.start();
		n.shiftgears();
		n.stop();
	}

}
