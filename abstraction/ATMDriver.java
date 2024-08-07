package com.corejava.abstraction;

public class ATMDriver extends ATM {
	
	void withdraw() {
		System.out.println("Money Withdraw");
	}
	
	void deposite() {
		System.out.println("Money Deposited");
	}
	
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		ATMDriver A= new ATMDriver();
		A.withdraw();
		A.deposite();
	}

}
