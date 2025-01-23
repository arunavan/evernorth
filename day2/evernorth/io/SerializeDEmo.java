package com.evernorth.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account implements Serializable{
	
	Integer id;
	String name;
	Double balance;
	
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}

	public Account(Integer id, String name, Double balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
}


public class SerializeDEmo {

	public static void main(String[] args) throws Exception{
		
		Account a1=new Account(123,"ram",99999.99);
		System.out.println("before serialization"+ a1);
		
		FileOutputStream f1=new FileOutputStream("C:\\Javatraining\\ser123.txt");
		ObjectOutputStream oos=new ObjectOutputStream(f1);
		oos.writeObject(a1);
		
		FileInputStream f2=new FileInputStream("C:\\\\Javatraining\\\\ser123.txt");
		ObjectInputStream oid=new ObjectInputStream(f2);
		//Object o=oid.readObject();
		//Account a2=(Account)o;
		Account a2=(Account)oid.readObject();
		System.out.println("after deserializae "+ a2.id+"  "+ a2.name +"  "+a2.balance);

	}

}
