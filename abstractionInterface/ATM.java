package com.corejava.abstractionInterface;

//Interface To Class

public class ATM implements Bank {
	
	int balance=1000;
	public void withdraw(int amount) {
		System.out.println("\n Money Withdraw" );
		balance-=amount;
		System.out.println("Balance is :"+balance);
	}
	@Override
	public void deposite(int amount) {
		// TODO Auto-generated method stub
		System.out.println("\n Money Deposited");
		balance+=amount;
		System.out.println("Balance is:"+balance);
		
	}
	
	public static void main(String[] args) {
		ATM a= new ATM();
		a.withdraw(500);
		a.deposite(400);
	}

}
