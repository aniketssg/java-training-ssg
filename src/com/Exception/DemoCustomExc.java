package com.Exception;

public class DemoCustomExc {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		f1();
		try {
		System.out.println(10/0);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("ended");
		

	}
	public static void f1() throws InterruptedException {
		for(int i =0;i<5;i++) {
			System.out.println(i);
			Thread.sleep(5);
		}
	}

}
