package com.corejava.polymorphism;


	
	class Dog extends Animal {
	    @Override
	    public void sound() {
	    	super.sound();
	        System.out.println("Dog barks");
	    }
	}


