package com.evernorth.threads;

class T1 implements Runnable {
	public  void run() {
		try {
			for(int i=0;i<=10;i++) {
			    Thread.sleep(2000);
				System.out.println(Thread.currentThread().getName());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class ThreadDemo1 {

	public static void main(String[] args) {
		T1 t=new T1();
		Thread t1=new Thread(t);
		t1.setName("Evernorth1");
		t1.start();
		
		System.out.println(t1.isAlive());
		System.out.println(t1.isInterrupted());
		//t1.interrupt();
		t1.yield();
		t1.suspend();
		t1.resume();
		t1.stop();
		//t1.destroy();
		t1.setPriority(5);  //10 1 5
		t1.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println(Thread.activeCount());
		try {
			for(int i=0;i<=10;i++) {
			    Thread.sleep(2000);
				System.out.println(Thread.currentThread().getName());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(Thread.activeCount());
	}

}
