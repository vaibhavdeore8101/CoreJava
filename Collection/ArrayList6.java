package com.corejava.Collection;

//Copy all the elements of array into arraylist
import java.util.ArrayList;

public class ArrayList6 {
	
	public static void main(String[] args) {
		
		int [] a= {1,2,3,4,5};
		System.out.println(a);
		ArrayList ar=new ArrayList();
		System.out.println(ar);
		for(int i=0;i<a.length;i++)
		{
			ar.add(a[i]);
		}
		System.out.println(ar);
	}

}
