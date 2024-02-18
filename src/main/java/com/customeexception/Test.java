package com.customeexception;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		


System.out.println("Enter your age.....");
Scanner scanner=new Scanner(System.in);


int age =scanner.nextInt();
 if(age>60)	{
		throw new TooYoungException("please wait some more time you will get best match soon!!");
	}
	else if(age<18) {
		throw new TooOldException("your age is already crossed marrige age ,no chance of getting marriage!!!");
	}
	else {
		System.out.println("Thanks for registration you will best match i will be send mail");
	}
		
	}

}
