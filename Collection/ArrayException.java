package com.corejava.Collection;

//NoSuchElementException
import java.util.*;

public class ArrayException {
	
	public static void main(String[] args) {
		
		ArrayList ar=new ArrayList();
	    Iterator i=ar.iterator();
	    System.out.println(i.next());
	}

}
