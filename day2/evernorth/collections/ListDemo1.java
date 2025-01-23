package com.collections;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;
public class ListDemo1 {
		public static void main(String[] args) {
			Set<String> names=new LinkedHashSet<>();
			names.add("ram");
			names.add("akhil");
			names.add("kiran");
			names.add("bindu");
			System.out.println(names);
			Set<Object> l=new TreeSet<>();  //HashSet, LinkedHashSet,TreeSet
			l.add(23);
			l.add(13);
			l.add(83);
			l.add(63);
			l.add(83);
			l.add(85);
			System.out.println(l);
			Iterator i=l.iterator();
			while(i.hasNext())
				System.out.println(i.next());
			System.out.println("lambda");
			l.forEach(x->System.out.println(x));
		}
	}
