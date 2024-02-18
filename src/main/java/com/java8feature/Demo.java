package com.java8feature;

public class Demo  {

	
	 public void m2() {
		 System.out.println("This m2 method of Demo class");
		 
	 }
	 public void m4() {
		 System.out.println("This is a method of m4 method");
		 
	 }
	
	public static void main(String args[]) {
		
		Demo m=new Demo();
		m.m2();
		m.m4();
			
		Interf i=(a,b)->System.out.println(a+b);
			i.m1(12, 12);
		  
         Interf.m3();
	}
 
	
	
	

}
