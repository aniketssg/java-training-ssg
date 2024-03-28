package com.Exception;

public class DemoCustomException {

	public static void main(String[] args) throws InvalidAge { //this  is the syntax for throws
		// TODO Auto-generated method stub
		//if we will use a try and catch block for our custom exceptions too then it wont
		//hinder the further execution of the program
		//if no try catch is used then the Hello at the end wont get printed 
		//this is why the best practice is to use the try catch along with our custom exceptions
		
		try {
		validateAge(-22);
		}
		catch (InvalidAge e) {
			e.printStackTrace();
			
		}
		System.out.println("hello");
		
	}
	
	public static void validateAge(int age) throws InvalidAge  { //this is the syntax for extending the throws class
		if (age < 0) {
			throw new InvalidAge("Invalid Age"); //this is a custom exception
		}
	}

}
