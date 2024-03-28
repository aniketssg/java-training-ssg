package com.javaprograms;

public class demo_pr1 {
	

	public static void main(String[] args) {
		// calling methods/functions of different programs of the same package
		employee obj = new employee();
		obj.f2();
		System.out.println(obj.comp+" "+obj.id);
		
		emp2 e2 = new emp2();
		System.out.println(e2.a);
	}

}
