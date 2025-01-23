package com.evernorth.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileDemo2 {

	public static void main(String[] args) throws IOException {
		/*
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		String name=sc.nextLine(); //sc.nextLine();
		Double marks=sc.nextDouble();
		System.out.println(age+"  "+ name +"  "+marks);
		*/
		
		//DataInputStream dis=new DataInputStream(System.in);
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int age=Integer.parseInt(br.readLine());
		String name=br.readLine(); 
		Double marks=Double.parseDouble(br.readLine());
		System.out.println(age+"  "+ name +"  "+marks);
	
		
		
		

	}

}
