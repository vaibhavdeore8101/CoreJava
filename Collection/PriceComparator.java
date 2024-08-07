package com.corejava.Collection;

import java.util.Comparator;

public class PriceComparator implements Comparator<Laptop>{

	@Override
	public int compare(Laptop o1, Laptop o2) {
		Laptop l=(Laptop)o1;
		Laptop l1=(Laptop)o2;
		if(l.price>l1.price) {
			return 1;
		}
		if(l.price<l1.price) {
			return -1;
		}
		return 0;
	}
	

}
