package com.java8feature;

public interface Interf {
	
	public void m1(int a,int b);
	
	//public void m11();
	//public void m11();
	
	default void m2() {
		//System.out.println("This is a m2 method");
		
	}
	default void m4() {
		System.out.println("default method" );
		
	}

	public static void m3() {
		System.out.println("This is a static method");
		
	}
}
