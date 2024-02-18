package com.simple_program;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Increement {
	
	public static void main (String args[]) {
		
	HashMap map=new HashMap();
	
	
	
	map.put(23, "ramesh");
	
	map.put(24,"datta" );
	
	map.put(25," ganesh");
	
	map.put(26, "shiva");
	
	map.put(27, "shyam");
	
	
	System.out.println(map);
	
	//iterate using entrySet
	System.out.println();
Iterator <Entry<Integer,String>> iterator=map.entrySet().iterator();
	
 while(iterator.hasNext()) {
	     Entry <Integer,String> entry= iterator.next();
	     System.out.println(entry.getKey());
	     System.out.println(entry.getValue());
 }
	
//iterate using keySet
 System.out.println();
 System.out.println("iterate Using keySet() ");
Iterator <Integer> itr=map.keySet().iterator();

while(itr.hasNext()) {
	Integer key=itr.next();
	
	System.out.println(key);
	System.out.println(map.get(key));
}
	
	
	
	
	
	
	
	
		
		
		}

}
