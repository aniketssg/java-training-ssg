package com.functional;

interface A //by default an interface without specifier is functional
{
	void show();
	
}

public class NewIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = ()->{
			System.out.println("Hello");
		};
		obj.show();
	}
}
