package com.java8feature;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HighestNumber {

	public static void main(String[] args) {
	  List<Integer>  number=Arrays.asList(3,3,2,4,7,8,9,10);
	  
List<Integer> evennumber=number.stream().filter(num->num%2==0).collect(Collectors.toList());
	  
List<Integer> oddNumber=number.stream().filter(num->num%2==1).collect(Collectors.toList());
	
	System.out.println(oddNumber);
	
	System.out.println(evennumber);
	Integer max= number.stream().max((i,j)->i.compareTo(j)).get();
	  
	  System.out.println(max);
	}

}
