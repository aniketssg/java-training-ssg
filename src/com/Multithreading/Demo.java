package com.Multithreading;

import java.io.*;

class Test {
	int nos = 10;
	synchronized void test_function(int n)
	{
		if(n<=nos) {
			System.out.println(nos-n);
		}
		else {
			System.out.println("Nooooo");
		}
	}
}

public class Demo {
	
	public static void main(String args[])
	{
		Test obj = new Test();

		Thread a = new Thread() {
			public void run() { 
				obj.test_function(4); 
				}
		};

		a.start();
		
		Thread B = new Thread() {
			public void run() { 
				obj.test_function(7); 
				}
		};
		B.start();
	}
}
