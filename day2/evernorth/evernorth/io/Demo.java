package com.evernorth.io;
import static java.lang.Math.*;
public class Demo {
	static int PI=89;
	static void  sum(int... a) {  //2 ,3   7,8 9,6   5,4,3,7,8,9,
		int s=0;
		for(int x:a)
			s+=x;
	    System.out.println("sum="+s);
	}
	public static void main(String[] args) {
		System.out.println(PI);
		System.out.println(Math.PI);
		
		System.out.println(PI);
		int a[]= {4,5};
		sum(7,8);
		int x[]= {4,3,3,1};
		sum(x);
		
	}
}
