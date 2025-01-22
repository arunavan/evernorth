package com.evernorth;

public class InitializerDemo {
	
	static {
		System.out.println("  static before main1");
	}
	public void main() {
		System.out.println(" custom main");
	}
	static {
		System.out.println("  static before main2");
	}
   //JVM
	static {
		System.out.println("  static before main3");
	}
	
	{ //instance block
		System.out.println("instance block1");
	}
	{ //instance block
		System.out.println("instance block2");
	}
	InitializerDemo(){
		System.out.println(" in constructor ");
	}
	public static void main(String[] args) {
		System.out.println("Name:"+args[0]);
		System.out.println("Mobile:"+args[1]);
		InitializerDemo i=new InitializerDemo();
		InitializerDemo i1=new InitializerDemo();
		InitializerDemo i2=new InitializerDemo();
		i.main();
i.main();
	}

}
