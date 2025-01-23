package com.evernorth.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.*;

class Student{
	Integer id;
	String name;
	public Student(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
}
public class App1 {
	
	public static void main(String[] args) {
		/*
		int a[]= {4,5,6,7};
		int b[]=new int[105];
		
		Integer marks[]=new Integer[10];
		Student students[]=new Student[5];
		students[0]=new Student(10,"ram");
		students[1]=new Student(11,"ram");
		students[2]=new Student(12,"ram");
		students[3]=new Student(13,"ram");
		students[4]=new Student(14,"ram");
		
		for( Student s:students)
			System.out.println(s);
		*/
		// add ,remove ,contains, size , indexOf , lastIndexOf
		List<Student> slist=new ArrayList<Student>();
		slist.add(new Student(10,"ram"));
		slist.add(new Student(12,"ram3"));
		slist.add(new Student(10,"ram"));
		slist.add(new Student(12,"ram3"));
		slist.add(new Student(10,"ram"));
		slist.add(new Student(12,"ram3"));
		System.out.println(slist.size());
		slist.forEach(s->System.out.println(s));
		
		//ArrayList list=new ArrayList();
		//LinkedList list=new LinkedList();
		//Vector list=new Vector();
		//list.addFirst(9);
		
		Set list=new TreeSet();
		list.add(37);
		list.add(32);
		list.add(48);
		list.add(23);
		list.add(3);
		list.add(23);
		list.add(3);
		list.add(4);
		System.out.println(list);
		System.out.println(list);
		/*
		System.out.println(list.size());
		//list.add(99);
		//list.remove(5);
		System.out.println(list);
		//list.clear();
		System.out.println(list.isEmpty());
		System.out.println(list.contains(8));
		System.out.println(list.indexOf(8));
		System.out.println(list.lastIndexOf(8));
		List newlist=Arrays.asList(45,56,67);
		list.addAll(newlist);
		System.out.println(list);
		//list.removeAll(newlist);
		//list.retainAll(newlist);
		System.out.println(list.containsAll(newlist));
		
		ListIterator  i=list.listIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		while(i.hasPrevious()) {
			System.out.println(i.previous());
		}
		*/
	}

}
