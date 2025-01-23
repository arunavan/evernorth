package com.evernorth;

class Singleton {
	public static Singleton s=null;
	private Singleton(){
	}
	public static Singleton getInstance() {
		if(s==null) {
			s=new Singleton();
		}
		return s;
	}
}
public class SingletonDemo {
	public static void main(String[] args) {
		Singleton s1=Singleton.getInstance();
		Singleton s2=Singleton.getInstance();
		System.out.println(s1 +  "  "+s2);
	}
}
