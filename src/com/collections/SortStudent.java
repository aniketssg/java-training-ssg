package com.collections;

import java.util.Comparator;

public class SortStudent implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.name.length() - o2.name.length();
	}

}
