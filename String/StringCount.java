package com.corejava.String;

public class StringCount {
	
	public static void main(String[] args) {
		
		String s="Hello World";
		int vowels=0;
		int consonent=0;
		for(int i=0;i<=s.length()-1;i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='i'||s.charAt(i)=='e'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				vowels++;
			}
			else {
				consonent++;
			}
			//System.out.println("Vowels:"+vowels+"Consonents:"+consonent);

		}
		
		System.out.println("Vowels:"+vowels+"Consonents:"+consonent);
	}

}
