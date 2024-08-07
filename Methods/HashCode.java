package com.corejava.Methods;

public class HashCode {
	
	String brand;
	int price;
	
	HashCode(String brand,int price){
		this.brand=brand;
		this.price=price;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Brand:"+brand+" Price:"+price;
	} 
	
	@Override
	public boolean equals(Object obj) {
		HashCode h=(HashCode)obj;
		if(this.brand==h.brand &&  this.price==h.price) {
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return ((Integer)price).hashCode()+brand.hashCode();
	}
	
	
	public static void main(String[] args) {
		HashCode h=new HashCode("Honda",450);
		HashCode f=new HashCode("Hero",500);
		HashCode s=h;
		
		System.out.println(h);
		System.out.println(f);
		System.out.println(h==f);
		System.out.println(h.equals(s));
		System.out.println(h.hashCode());
		System.out.println(s.hashCode());
		System.out.println(f.hashCode());
		if(h.equals(f) && h.hashCode()==s.hashCode()) {
			System.out.println("Objects Are Identical");
		}
		else {
			System.out.println("Objects Are Not Identical");
		}
	}

}
