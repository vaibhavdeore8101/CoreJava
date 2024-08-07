package com.corejava.Collection;

import java.util.LinkedList;

public class LinkedList1 {
	
private LinkedList<Integer> list; // Create a LinkedList to hold the elements
    
    public LinkedList1() {
        list = new LinkedList<>(); // Initialize the LinkedList in the constructor
    }

    public void add(int element) {
        list.add(element); // Add the element to the LinkedList
    }
    
   @Override
	public String toString() {
		// TODO Auto-generated method stub
		return list.toString();
	}


	public static void main(String[] args) {
		
		LinkedList1 l1=new LinkedList1();
		l1.add(10);
		l1.add(20);
		System.out.println(l1);
		
		
	}

	
}
