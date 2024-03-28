package com.Exception;

public class DemoException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println(10/0);
			System.out.println("hello");
		}
		catch (Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("End");
		}
		System.out.println("33");
		
//		int i=10,j=20,k=0;
//		
//		int x,y;
//		try {
//			x = i/k;
//		}
//		catch (ArithmeticException e) {
//			System.out.println(e);
//			//System.out.println("Wrong");
//			//e.printStackTrace();
//		}
//		y = j/i;
//		System.out.println(y);
		
		

	}

}
