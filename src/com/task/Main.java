package com.task;

import java.util.ArrayList;
import java.util.List;

public class Main implements Interface {
	
	Product p1 = new Product(1,"An",3344);
	Product p2 = new Product(2,"Ak",7766);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m1 = new Main();
		
		List<Product> kk = m1.cal();
		System.out.println(kk);
		System.out.println(m1.ret(kk, 2));
                        
	}

	@Override
	public List<Product> cal() {
		// TODO Auto-generated method stub
		List<Product> res = new ArrayList<>();
		res.add(p1);
		res.add(p2);
		
		return res;
	}

	@Override
	public Product ret(List<Product> kk, int id) {
		// TODO Auto-generated method stub
		for(Product pp:kk) {
			if(pp.id == id) {
				return pp;
			}
		}		
		return null;
	}
	
}