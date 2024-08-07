package com.corejava.String;

public class StringPallindrome {
	public static void main(String[] args) {
		
		String s="malayalam";
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		
		if(s.equals(rev)) {
			System.out.println("String is Pallindrome");
		}
		else {
			System.out.println("String Not Pallindome");
		}
		
	}

}
