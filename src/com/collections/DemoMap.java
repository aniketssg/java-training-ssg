package com.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DemoMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, Integer> m = new HashMap<>();
		
		m.put(1,22);
		m.put(2,8);
		System.out.println(m);
		Set<Map.Entry<Integer, Integer>> s = m.entrySet();
		for(Map.Entry<Integer,Integer> k : s) {
			System.out.println(k.getKey()+" "+k.getValue());
		}
		
		
		

	}

}
