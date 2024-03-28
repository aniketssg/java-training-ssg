package com.javaprograms;

public class emp2 {
	public int a = 11;
	private int b = 22;
	int c  = 30;
	protected int d = 29;
	// calling these in other programs of different and same packages
	
	public static void main(String[] args)
	{
		emp2 obj = new emp2();
		System.out.println(obj.b);
	}
}
