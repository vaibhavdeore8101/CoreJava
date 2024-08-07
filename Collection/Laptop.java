package com.corejava.Collection;

import java.util.*;
public class Laptop {
	String brand;
	int ram;
	int ssd;
	double price;
	
	Laptop(String brand,int ram,int ssd,double price){
		this.brand=brand;
		this.price=price;
		this.ssd=ssd;
		this.ram=ram;
	}
	
	@Override
	public String toString() {
		return "Laptop Brand:"+brand+" Price:"+price+" SSD:"+ssd+" RAM:"+ram;
	}

	
	public static void main(String[] args) {
		
		ArrayList Laptop=new ArrayList();
		
		Laptop.add(new Laptop("HCL", 8, 512, 60000));
		Laptop.add(new Laptop("Lenovo", 4, 256, 30000));
		Laptop.add(new Laptop("Hp", 12,1024, 45000));
		Laptop.add(new Laptop("Dell", 16, 1024, 65000));
		Laptop.add(new Laptop("Asus", 8,   512, 70000));
		System.out.println(Laptop);
		
		System.out.println("Laptops are sorted on the basis of ram");
		Collections.sort(Laptop,new RAMComparator());
		for(Object e:Laptop) {
			System.out.println(e);
		}
		
		System.out.println("Laptops are Sortd On The basis Of Price");
		Collections.sort(Laptop,new PriceComparator());
		for(Object c:Laptop) {
			System.out.println(c);
		}
	}





	




	
	
	
	

}
