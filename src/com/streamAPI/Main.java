package com.streamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> p = new ArrayList<>();
		p.add(new Product (100,"Laptop",50000));
		p.add(new Product (101,"CPU",78000));
		p.add(new Product (102,"Mobile",32000));
		p.add(new Product (103,"Ipad",67000));
		p.add(new Product (104,"MacBook",25000));
		
		//p.stream().sorted((x,y)->(int)x.price-(int)y.price).forEach(n->System.out.println(n));
		List<Product> newList = p.stream().map(e -> {
			      e.setPrice(e.getPrice() + 100);
			      return e;
			    })
			    .collect(Collectors.toList());
		System.out.println(newList);
		
		Optional<Product> mp = p.stream()
				.collect(Collectors.maxBy(Comparator.comparing(Product::getPrice)));
		System.out.println(mp);
		
		
		//p.stream().filter(pp -> pp.price >= 35000).forEach(n -> System.out.println(n));
		//p.stream().filter(pd -> pd.num == 103).forEach(nd -> System.out.println(nd));		
		
//		p.stream().map(s -> s.price + 100).forEach(kk -> System.out.println(kk));
//		
//		List res = p.stream().map(x->x.price+ 100).collect(Collectors.toList());
//		System.out.println(res);
//		for(Product pp:p) {
//			if(pp.price > 35000) {
//				System.out.println(pp);
//			}
//		}
	
	

	}

}
