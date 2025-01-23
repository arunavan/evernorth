package com.evernorth.io;

class InvalidAgeException extends Exception {
	InvalidAgeException(String msg){
		super(msg);
	}
}
public class ExceptionDEmo1 {
	public static void main(String[] args)  throws Exception{
		int age=2;
		
		if(age<18)
				throw new InvalidAgeException("Voter age is 19");
			else
				System.out.println(" Eligible");
	}
}
