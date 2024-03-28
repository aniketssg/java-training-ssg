package com.gettersetter;

public class Person1 {
	
	String name;
	int num;
	Address adr;
	

	public Person1(String name, int num, Address adr) {
		super();
		this.name = name;
		this.num = num;
		this.adr = adr;
	}


	@Override
	public String toString() {
		return "Person1 [name=" + name + ", num=" + num + ", adr=" + adr + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address a1 = new Address("Wajidpur","Noida",22);
		Person1 p1 = new Person1("aniket",22,a1);
		Person1 p2 = new Person1("Ayush",23, new Address("Sector 168","Noida",88));
		System.out.println(p1);
		System.out.println(p2);

	}

}

//bank - id,name, ifsc, address
//customer - name, acc num,address, phone num, type, balance
//deposit, withdraw
