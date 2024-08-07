package com.corejava.Collection;

//Copy One Array To Another array
import java.util.*;

public class ArrayList1 {
	
	public static void main(String[] args) {
		
		ArrayList arr=new ArrayList();
		arr.add(100);
		arr.add(200);
		arr.add(300);
		
		System.out.println(arr);
		ArrayList ar=new ArrayList(arr);
		System.out.println(ar);
	}

	

}
