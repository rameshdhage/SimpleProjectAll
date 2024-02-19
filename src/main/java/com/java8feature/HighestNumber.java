package com.java8feature;

import java.util.Arrays;
import java.util.List;

public class HighestNumber {

	public static void main(String[] args) {
	  List<Integer>  number=Arrays.asList(3,3,2,4,7,8,9,10);
	  
	Integer max= number.stream().max((i,j)->i.compareTo(j)).get();
	  
	  System.out.println(max);
	}

}
