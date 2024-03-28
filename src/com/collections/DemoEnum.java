package com.collections;

import java.util.EnumMap;
import java.util.Map;

public class DemoEnum {
	public enum Days{
		Mon,Tue,Wed,Thu,Fri,Sat,Sun
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Days d = Days.Thu;
		//System.out.println(d+" "+d.ordinal());
		EnumMap<Days,Integer> e = new EnumMap<>(Days.class);
		e.put(Days.Mon,1);
		e.put(Days.Tue,2);
		e.put(Days.Wed,3);
		e.put(Days.Thu,4);
		e.put(Days.Fri,5);
		e.put(Days.Sat,6);
		e.put(Days.Sun,7);
		
		for(Map.Entry<Days,Integer> x : e.entrySet()) {
				System.out.println(x.getKey()+" "+x.getValue());
			
		}
		

	}

}
