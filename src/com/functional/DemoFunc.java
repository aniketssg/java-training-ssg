package com.functional;

@functionalInterface
//interface A //by default an interface without specifier is functional
//{
//	void add();
//	
//}
////class B implements A
//{
//
//	@Override
//	public void show() {
//		// TODO Auto-generated method stub
//		System.out.println("Hello");
//	}
//	
//}
interface B{
	int add(int x,int y);
}

public class DemoFunc {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		A obj = new A() {
//
//			@Override
//			public void show() {
//				// TODO Auto-generated method stub
//				System.out.println("Hello");
//				
//			}
//			
//		};
		B ob = (int x, int y)->{
			return x+y;
			
		};
		//for directly calling an interface 
//		A obj = ()->{
//			int a = 10;
//			int b = 20;
//			System.out.println(a+b);
//		};
		System.out.println(ob.add(10,20));

	}

	

}
