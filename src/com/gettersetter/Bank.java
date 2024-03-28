package com.gettersetter;

public class Bank {
	String name;
	long IFSC;
	Address adr;
	Customer cus;
	
	public Bank(String name, long iFSC, Address adr, Customer cus) {
		this.name = name;
		IFSC = iFSC;
		this.adr = adr;
		this.cus = cus;
	}

	@Override
	public String toString() {
		return "Bank [name=" + name + ", IFSC=" + IFSC + ", adr=" + adr + ", cus=" + cus + "]";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1 = new Customer("Aniket",99L,9898L,200);
		Bank b1 = new Bank("ani",123,new Address("W","N",11),c1);
		System.out.println(b1);
		with(701,c1.balance);
		depo(500,c1.balance);
		depo(1000,c1.balance);
		
		
		

	}
	public static void depo(int amm,int balance) {
		if(amm<500) {
			System.out.println("Sorry, can't deposit");
		}
		else {
			balance = balance + amm;
			System.out.println(balance);
		}
	}
	
	public static void with(int amm, int balance) {
		if (amm > balance) {
			System.out.println("Sorry, can't withdraw");
		}
		else {
			balance = balance - amm;
			System.out.println(balance);
		}
	}

}
