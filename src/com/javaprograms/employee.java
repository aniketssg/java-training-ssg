package com.javaprograms;

public class employee 
{
	static String comp = "SSG";
	public int id;
	public String name;
	private long phoneNum;
	private String address;
	
	public static void main(String[] args) {
		employee obj = new employee();
		obj.f1(11,"Aniket",987987987987L,"Sunworld Arista");
		System.out.println(comp+" "+obj.id+" "+obj.name+" "+obj.phoneNum+" "+obj.address);
		obj.f2();
		System.out.println(comp+" "+obj.id+" "+obj.name+" "+obj.phoneNum+" "+obj.address);
		
	}

	// creating two methods, one with values and other where the values are being given
	public void f1(int idNum, String empName, long phoneNum, String address) 
	{
		this.id = idNum;
		this.name = empName;
		this.phoneNum = phoneNum;
		this.address = address;
	}
	public void f2() {
		id = 22;
		name = "Ayush";
		phoneNum = 2233L;
		address = "Sector 103";
	}

	
}
	
	
	

