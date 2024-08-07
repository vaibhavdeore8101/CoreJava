package com.corejava.Collection;

import java.util.*;

import com.corejava.Methods.EqualObj;

public class ShirtHashSet {
	
	String brand;
	double price;
	String color;
	
	public ShirtHashSet(String brand,double price,String color) {
		this.brand=brand;
		this.price=price;
		this.color=color;
}
	
	@Override
	public String toString() {
		return "Shirt Brand:"+brand+" Price:"+price+" color:"+color;
	}
	
	@Override
	public boolean equals(Object obj) {
	    ShirtHashSet s=(ShirtHashSet)obj;
	    if(this.brand.equals(s.brand)&& this.color.equals(s.color)) {
	    	return true;
	    }
		return false;
	}
	@Override
	public int hashCode() {
		return brand.hashCode()+color.hashCode();
	}
	
	
	public static void main(String[] args) {
		
		HashSet<Object> h=new HashSet<Object>();
		h.add(new ShirtHashSet("a", 500, "Yellow"));
		h.add(new ShirtHashSet("b", 654, "red"));
		h.add(new ShirtHashSet("c", 500, "yellow"));
		h.add(new ShirtHashSet("red", 950, "red"));
		
	
	
	Iterator<Object> i=h.iterator();
	while (i.hasNext()) {
		System.out.println(i.next());
	}

}
}
