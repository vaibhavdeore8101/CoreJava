package com.corejava.Collection;

import java.util.Comparator;

public class RAMComparator implements Comparator<Laptop>{

	@Override
	public int compare(Laptop o1, Laptop o2) {
		Laptop l=(Laptop)o1;
		Laptop l1=(Laptop)o2;
		if(l.ram>l1.ram) {
			return 1;
		}
		if(l.ram<l1.ram) {
			return -1;
		}
		return 0;
	}

}
