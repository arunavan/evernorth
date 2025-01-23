package com.evernorth.io;

import java.io.File;

public class FileApplication {

	public static void main(String[] args) {
		File f=new File("C:\\Javatraining");
		System.out.println(f.isFile());
		
		System.out.println(f.isDirectory());
       String files[]=f.list();
       for( String name: files)
    	   System.out.println(name);
		
	}

}
