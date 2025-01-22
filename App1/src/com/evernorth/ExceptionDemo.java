package com.evernorth;

import java.io.FileReader;
import java.io.IOException;

public class ExceptionDemo {

	public static void main(String[] args) throws IOException{
		
		//Thread.sleep(5000);
		FileReader f=new FileReader("C:\\Javatraining\\out.txt");
		int x[]= {5,4,6};
		try {
			try {
			  int y=10/0;
			}
			catch(ArithmeticException e) {
				//System.out.println(e);
				e.printStackTrace();
				//System.out.println(e.getMessage());
			}
			System.out.println(x[4]);
		
		
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			try {
				
			}
			catch() {
				
			}
			e.printStackTrace();
		}
		finally {
			
			f.close();
		System.out.println("thank you");
		}
	}

}
