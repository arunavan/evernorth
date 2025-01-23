package com.evernorth.io;


enum size{
	S,M,L,XL,XXL
}
enum week {
	m,t,w,th,
}
public class EnumDemo {
	public static void main(String[] args) {
		
		size x=size.M;
		
		switch (x) {
		case S: { System.out.println(" kids size"); break;}
		case M :{ System.out.println(" medium "); break;}
		
		}
		

	}

}
