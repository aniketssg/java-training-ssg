package com.Exception;

import com.general.LengthFinder;

public class Customer {
	
	int num; 
	
	public void setNumber(int number) throws Custom
    {
		int k = LengthFinder.LF(number);
		
        
        if (k < 5) {
        		throw new Custom("Invalid");
            
        }
        num = number;
    }
 
    
    public int getNumber() { return num; }
}


