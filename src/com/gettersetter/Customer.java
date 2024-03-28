package com.gettersetter;

public class Customer {
	String name;
	long accNum;
	long phnNum;
	int balance;
	
	

	public Customer(String name, long accNum, long phnNum, int balance) {
		this.name = name;
		this.accNum = accNum;
		this.phnNum = phnNum;
		this.balance = balance;
	}



	@Override
	public String toString() {
		return "Customer [name=" + name + ", accNum=" + accNum + ", phnNum=" + phnNum + ", balance="
				+ balance + "]";
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Customer c1 = new Customer("A",123,new Address("Wajid","Noida",11),9918,44600);
//		Customer c2 = new Customer("B",234,new Address("168","Noida",22),7656,800);
		
		

	}
}

