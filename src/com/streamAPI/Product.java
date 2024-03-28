package com.streamAPI;

public class Product {
	int num;
	String name;
	double price;
	
	public Product(int num, String name, double price) {
		
		this.num = num;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [num=" + num + ", name=" + name + ", price=" + price + "]";
	}

	public double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	public void setPrice(double d) {
		// TODO Auto-generated method stub
		this.price = d;
		
	}
	
	
	
	

}
