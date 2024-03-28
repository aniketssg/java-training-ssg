package com.general;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.streamAPI.Product;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Project> p = new ArrayList<>();
		p.add(new Project (1,"Python","Noida"));
		p.add(new Project (2,"Python","Chennai"));
		p.add(new Project (3,"Python","Bengaluru"));
		p.add(new Project (4,"SAP","Noida"));
		p.add(new Project (5,"SAP","Chennai"));
		p.add(new Project (6,"React","Bengaluru"));
		p.add(new Project (7,"React","Noida"));
		p.add(new Project (8,"React","Chennai"));
		p.add(new Project (9,"Java","Bengaluru"));
		p.add(new Project (10,"Java","Noida"));
		
		p.stream().filter(pd -> pd.location == "Chennai").forEach(i -> System.out.println(i));
		
		Map<String, Long> ct = p.stream()
				.collect(Collectors.groupingBy(Project ::getLocation,Collectors.counting()));
		
		System.out.println(ct);
		
		System.out.println(ct.get("Chennai"));
		
		
	}

}