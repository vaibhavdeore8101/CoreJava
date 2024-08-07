package com.corejava.Collection;

import java.util.*;

public class BikeHashSet {
	
	String brand;
	int cc;
	
	public BikeHashSet(String brand,int cc) {
		this.brand=brand;
		this.cc=cc;
	}
	
	@Override
	public String toString() {
		return "Bike Name:"+brand+" Engine Power:"+cc;
	}
	
	@Override
	public boolean equals(Object obj) {
		BikeHashSet temp=(BikeHashSet)obj;
		if(this.brand.equals(temp.brand) && this.cc==temp.cc){
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
	
		return brand.hashCode()+((Integer)cc).hashCode();
	}
	
	public static void main(String[] args) {
		
		HashSet<Object> hs=new HashSet<Object>();
		hs.add(new BikeHashSet("YAMAHA",125));
		hs.add(new BikeHashSet("HONDA", 250));
		hs.add(new BikeHashSet("HERO", 110));
		hs.add(new BikeHashSet("SUZUKI",150));
		System.out.println(hs);
		
	}

}
