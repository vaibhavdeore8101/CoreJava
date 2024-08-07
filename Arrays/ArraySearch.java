package com.corejava.Arrays;
import java.util.Scanner; 

public class ArraySearch {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The No To search");
		int a=sc.nextInt();
		int [] arr= {1,2,3,4,5,6,7};
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==a) {
				System.out.println("The Element Is Present");
			}
			else {
				System.out.println("the Element is not Present");
			}
		}
		
		for(int i=arr.length-1;i>0;i--) {
			System.out.print(arr[i]);
		}
	}

}
