package com.corejava.abstractionInterface;

//Interface To Interface To Class

public class SUV {
	
	void start() {
		System.out.println("SUV Started");
	}
	
	void horn() {
		System.out.println("Pop Pop POP");
	}
	
	void stop() {
		System.out.println("SUV Stopped");
	}
	
	public static void main(String[] args) {
		SUV s=new SUV();
		s.start();
		s.horn();
		s.stop();
	}

}
