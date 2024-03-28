package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DemoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Emp> data = new ArrayList<>();
		
		Emp e1 = new Emp("A",1);
		Emp e2 = new Emp("B",2);
		
		data.add(e1);
		data.add(e2);
		System.out.println(data);
		data.addAll(Arrays.asList(new Emp("c",3),new Emp("d",4)));
		System.out.println(data);
		
		List<Integer> num2 = new ArrayList<>();
		num2.add(77);
		num2.add(88);
		List <Integer> nums = new ArrayList<>();
		//System.out.println(nums.add(10));
		nums.add(22);
		nums.add(33);
		//System.out.println(nums);
		nums.add(1,44);
		nums.addAll(num2);
		//System.out.println(nums);
		nums.addAll(Arrays.asList(78,98,93));
		//System.out.println(nums);
		Collections.sort(nums);
		System.out.println(nums);
		
		
		

	}

}
