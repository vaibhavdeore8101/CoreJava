package com.corejava.encapsulation;

	
	public class ATMDriver{
		public static void main(String[] args) {
			ATM A=new ATM();
			System.out.println(A.getpin());
			A.setpin(1234);
			System.out.println(A.getpin());
		}

}
	

