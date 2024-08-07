package com.corejava.String;

public class StringReverse {
	
	public static void main(String[] args) {
		
		String s="String Programme";
		
		for(int i=s.length()-1;i>=0;i--) {
			System.out.println(s.charAt(i));
		}
	}

}
