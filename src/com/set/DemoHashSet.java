package com.set;

import java.util.HashSet;
import java.util.Set;

public class DemoHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> s = new HashSet<>();
		s.add(399);
		System.out.println(s);
		s.add(null);
		s.add(null);
		System.out.println(s);
	}
}
