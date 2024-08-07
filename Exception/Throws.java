package com.corejava.Exception;

import java.io.FileNotFoundException;
import java.io.FileInputStream;

public class Throws {
	
	static void openFile()throws FileNotFoundException{
		FileInputStream is= new FileInputStream("D:\\Demo.txt");
	}
	public static void main(String[] args) throws FileNotFoundException {
		
		System.out.println("Main Start");
		try {
		openFile();
		}
		catch(FileNotFoundException e) {
			System.out.println("File CanNot Be Accessed ,Reason :"+e.getMessage()+"\n Stack Trace:");
			e.printStackTrace();
		}
		System.out.println("Main Ends");
		
	}

}
