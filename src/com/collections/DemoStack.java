package com.collections;

import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

public class DemoStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		
		st.push(11);
		st.push(22);
		st.push(88);
		st.push(11);
		st.push(22);
		st.push(88);
		st.push(11);
		st.push(22);
		st.push(88);
		st.push(11);
		st.push(44);
		
//		System.out.println(st);
		//System.out.println(st.peek());
//		st.pop();
		System.out.println(st.capacity());
		//System.out.println(st);
		
		Map<Integer, String> m = new TreeMap<>();
	}

}
