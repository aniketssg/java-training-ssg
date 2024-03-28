package com.general;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class IODemo {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Project obj = new Project(1,"Hehe","Noida");
		File f = new File("demo.text");
		ObjectOutputStream s = new ObjectOutputStream(new FileOutputStream(f));
		
		ObjectInputStream rd = new ObjectInputStream(new FileInputStream(f));
		s.writeObject(obj); //writing the object
		Project p = (Project) rd.readObject(); //reading the object
		System.out.println(p);
		s.close();
		
	}

}
