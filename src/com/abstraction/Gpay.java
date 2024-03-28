package com.abstraction;

public class Gpay extends Payment{
	void methodP() {
		System.out.println("Payment done");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gpay g = new Gpay();
		g.methodP();
		g.generateBill();

	}

}
