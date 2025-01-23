package com.collections;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
public class ListDemo {
	public static void main(String[] args) {
		List l=new Vector();
		l.add(23);
		l.add(45345.34543);
		l.add("java");
		l.add(LocalDate.now());
		l.add("java");
		l.add("java");
		l.add(23);
		l.add(23);
		System.out.println(l);
		System.out.println(l.size());
	//	l.clear();
		l.remove(2);
		System.out.println(l.contains("java"));
		System.out.println(l.indexOf("java"));
		System.out.println(l.lastIndexOf("java"));
		System.out.println(l.isEmpty());
		ArrayList a1=new ArrayList();
		a1.add(45);
		a1.add(56);
		a1.add(67);
		l.addAll(a1);
		System.out.println(" a1 elements");
		System.out.println(a1);
		System.out.println(l);
		//l.removeAll(a1);
		//l.retainAll(a1);
		System.out.println(l);
		System.out.println(l.containsAll(a1));
		for( Object o:l)
			System.out.println(o);
		Iterator i=l.iterator();
		while(i.hasNext())
			System.out.println(i.next());
		System.out.println("lambda");
		l.forEach(x->System.out.println(x));
		

		
		
	}

}
