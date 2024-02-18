package com.defaultmethod;

public class Demo implements Right,Left {
	
	 public void m1() {
		 
		 System.out.println("Demo class own method");
		 Right.super.m1();
		 Left.super.m1();
		 
		 
		 
	 }
	
	
	
	public static void main(String args[]) {
		
		Demo demo=new Demo();
		demo.m1();
		
	}
	
	

}
