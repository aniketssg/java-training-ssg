package com.Exception;

public class InvalidAge extends Exception {
	//this class is having the exception class inherited and then we also have a constructor
	//which passes the message to super class(parent class) and then it puts the message 
	//in the exception super class which gets printed accordingly, just like the other error 
	//messages.
	public InvalidAge(String msg) {
		super(msg);
	}
	

}
