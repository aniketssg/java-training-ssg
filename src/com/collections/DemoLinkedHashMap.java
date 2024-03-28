package com.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class DemoLinkedHashMap {
	
	public static void main(String[] args) {
		Map<Integer,String> m = new LinkedHashMap<>();
		m.put(399, "A");
		m.put(2, "b");
		System.out.println(m);
		System.out.println(m.size());
		
	}
	

}
