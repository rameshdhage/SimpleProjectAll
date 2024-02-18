package com.defaultmethod;

public interface Left {
	
	default void m1() {
		System.out.println("This is a left inteface m1 method");
		
	}

}
