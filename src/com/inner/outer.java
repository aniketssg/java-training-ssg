package com.inner;

public class outer {
	int x = 10;
	
	static class Emp {
		int y = 30;
	}

	public static void main(String[] args) {
		// class inside class
		outer e = new outer();
		System.out.println(e.x);
		outer.Emp obj = new outer.Emp(); //as it is already a static class
		// for non static class : outer.Emp obj = e.new emp();
		System.out.println(obj.y);
		
		

	}

}
