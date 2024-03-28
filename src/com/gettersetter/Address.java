//street name,city, door num
//constructor parameterized - 
//can put two string
//
package com.gettersetter;

public class Address {
	String street;
	String city;
	int door;
	
	
	public Address(String street, String city, int door) {
		
		this.street = street;
		this.city = city;
		this.door = door;
	}


	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", door=" + door + "]";
	}



}
