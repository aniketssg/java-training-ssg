package com.constructor;

import java.util.Objects;

public class demoCons {
	
	int num;
	String name;
	
	

	public demoCons(int num, String name) {
		
		this.num = num;
		this.name = name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demoCons c1 = new demoCons(1,"Aniket");
		System.out.println(c1.hashCode()); //generates the hash code for the memory allocated
		
		demoCons c2 = new demoCons(1,"Aniket");
		//System.out.println(c2);
		System.out.println(c2.hashCode());
		
		//demoCons c3 = c1;
		//System.out.println(c3.hashCode());

	}
	
	//this function down here finds if the values for the objects are same or not
	//if the object values are same then it will point the same hashcode location
	//for both the objects.
	
	//if the equal returns true then it will assign the same hashcode
	@Override
	public int hashCode() {
		return Objects.hash(name, num);
	}
	//checks for the equal  values inside the objects
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		demoCons other = (demoCons) obj;
		return Objects.equals(name, other.name) && num == other.num;
	}

	//for displaying the data without making a real call.
	@Override
	public String toString() {
		return "demoCons [num=" + num + ", name=" + name + "]";
	}

}
