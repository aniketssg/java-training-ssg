package com.streamAPI;

import com.functional.functionalInterface;

@functionalInterface
interface A{
	int f1(int a);
}

public class MethodRef {
	public int f2(int x) {
		return x*x;
	}
	
	public static int f3(int x) {
		return x*x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//method 1
		A obj = (int x) -> {
			return x*x;
		};
		
		System.out.println(obj.f1(2));
		
		A obj2 = MethodRef::f3;
		System.out.println(obj2.f1(3));
		
		MethodRef obj3 = new MethodRef();
		A obj4 = obj3::f2;
		System.out.println(obj4.f1(4));

	}
}
