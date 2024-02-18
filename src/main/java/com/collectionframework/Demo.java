package com.collectionframework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;

public class Demo {
	
	
	public static void main(String args[]) {
		
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		
		map.put(101,"c");
		map.put(102,"c++");
		map.put(103,"java");
		map.put(104,"python");
		map.put(105,".net");
		System.out.println("HashMap normal print");
		
		System.out.println(map);
		System.out.println();		
		System.out.println("Using Iterator and entrySet");
		Iterator <Entry<Integer,String>> iterator=map.entrySet().iterator();
		
		while(iterator.hasNext()) {
		Entry<Integer,String>entry =iterator.next();
		
		System.out.println(entry.getKey());
		System.out.println(entry.getValue());
		
		}
		System.out.println();
		System.out.println("Using Itertor and keySet");
		
		
		Iterator <Integer> itr=map.keySet().iterator();
		
		while(itr.hasNext()) {
		Integer	key=itr.next();
		
		System.out.println(key);
		System.out.println(map.get(key));
			
		}
		System.out.println();
		
		System.out.println("Using lambda expretion ");
		
		map.forEach((key,value)->{
			System.out.println(key);
			System.out.println(value);
			
		});
		
		
	}

}
