package com.corejava.Methods;

public class toString1 {
	
	String brand;
	double price;
	String color;
	
	
	toString1(String brand,double price,String color){
		this.brand=brand;
		this.color=color;
		this.price=price;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Brand Name:"+brand+" Price:"+price+" Color:"+color;
		
	}
	public static void main(String[] args) {
		toString1 s=new toString1("Range Rover",5000000,"White");
		toString1 u=new toString1("BMW",4500000,"Green");
		
		System.out.println(s);
		System.out.println(u);
		
	}

}
