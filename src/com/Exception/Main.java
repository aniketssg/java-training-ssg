package com.Exception;

public class Main {

	public static void main(String[] args) throws Custom {
		// TODO Auto-generated method stub
		Customer c = new Customer();
		try {
			c.setNumber(4567);;
		}
		catch(Custom e) {
			e.printStackTrace();
		}

	}
	

}
