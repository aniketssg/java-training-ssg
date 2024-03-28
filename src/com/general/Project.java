package com.general;

import java.io.Serializable;

public class Project implements Serializable{
	int id;
	String name;
	String location;
	public Project(int id, String name, String location) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
	}
	
	public String getLocation() {
		return location;
	}


	@Override
	public String toString() {
		return "Project [id=" + id + ", name=" + name + ", location=" + location + "]";
	}
	
	

}
