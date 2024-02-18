package com.multipleInheritance;

public class Demo implements Left,Right {

	@Override
	public void m1() {
		System.out.println("this is Demo class method");
		
	}
public static void main(String args[]) {
	
	Demo demo=new Demo();
	demo.m1();
}
}
