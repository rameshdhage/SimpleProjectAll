package com.java8feature;

import java.util.Arrays;
import java.util.List;

public class LowestNumber {

	public static void main(String[] args) {
		
	List <Integer>	number=Arrays.asList(399,334,3432,123,122,3423,4234,2422,13122,342);
	 
	Integer   min=number.stream().min((i,j)->i.compareTo(j)).get();
	
	
	System.out.println(min);
	}

}
