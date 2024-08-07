package com.corejava.Collection;

import java.util.*;

public class ArrayList10 {
	
	public static void main(String[] args) {
		
		ArrayList ar=new ArrayList();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(40);
		ar.add(50);
		System.out.println(ar);
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int index= ar.indexOf(num);
		if(index==-1) {
			System.out.println("Element Not Availabal");
			System.out.println(ar);
		}
		else {
			System.out.println("Element Found");
			ar.remove(index);
			System.out.println(ar);
		}
	}

}
