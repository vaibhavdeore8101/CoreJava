package com.corejava.Collection;

import java.util.*;

public class Priority {
	
	public static void main(String[] args) {
		
		PriorityQueue p=new PriorityQueue();
		p.add(12);
		p.add(0);
		p.add(65);
		p.add(65);
		p.add(98);
		//p.add("str");
		System.out.println(p);
		
		p.remove();
		System.out.println(p);
		
		
		System.out.println(p.peek());
		
		System.out.println(p.poll());
		System.out.println(p);
	}

}
