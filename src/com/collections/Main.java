package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Student> st = new ArrayList<>();
		st.add(new Student(87,"AB"));
		st.add(new Student(2,"BCDR"));
		st.add(new Student(30,"DC"));
		
		Collections.sort(st, new SortStudent());
		System.out.println(st);

	}

}
