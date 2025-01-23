package com.evernorth.threads;

class CallMe{
	public  void call(String name) { //JVM wait()   notify
		synchronized(this) {
		try {
			System.out.print(" [ welcome to MR/Mrs/Miss");
			Thread.sleep(1000);
			System.out.print (name);
			System.out.print ( "  Thank you ]");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
		//.......
	}
	
}
class Caller extends Thread{
	String name;
	CallMe callMe;
	Caller(CallMe callMe,String name ){
		this.callMe=callMe;
		this.name=name;
		this.start();
	}
	public void run() {
		callMe.call(name);
	}
	
	
	
}
public class SyncDemo {

	public static void main(String[] args) {
		CallMe cm=new CallMe();
		Caller c1=new Caller(cm,"Irfan");
		Caller c2=new Caller(cm,"Siddeshwer");
		Caller c3=new Caller(cm,"Shivamani");
		

	}

}
