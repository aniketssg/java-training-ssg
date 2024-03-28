package com.Multithreading;

class A extends Thread{
	public void run(){
		for(int i =0;i<10;i++) {
			System.out.println(i);
		}
	}
}

class B extends Thread{
	public void run(){
		for(int i =0;i<10;i++) {
			System.out.println("Hello");
		}
	}
}
public class demoMulti {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		A obj1 = new A();
		B obj2 = new B();
		obj1.start();
		obj1.join();
		obj2.start();

	}

}
