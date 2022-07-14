package com.assignment.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateArray implements Predicate<Integer> {
	
	int even=0;
	int odd=0;
	@Override
	public boolean test(Integer t) {
		if(t%2==0)
		{
			even++;
			return true;
		}
		else
		{
			odd++;
			return false;
		}
	}

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(1,2,4,5,6,7,8,9,10);
		PredicateArray obj=new PredicateArray();
		for(int i:list)
		{
			obj.test(i);
		}
		System.out.println("Even number: "+obj.even);
		System.out.println("Odd number: "+obj.odd);
		
	}

	
}


