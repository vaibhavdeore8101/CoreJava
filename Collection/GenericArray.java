package com.corejava.Collection;

import java.util.*;

public class GenericArray {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		
		for(int q:a) {
			System.out.println(q);
		}
	}

}
