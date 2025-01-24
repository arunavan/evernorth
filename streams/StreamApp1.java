package com.evernorth.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

class Bank{
	
	Integer id;
	String name;
	public Bank(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Bank [id=" + id + ", name=" + name + "]";
	}
	
}

public class StreamApp1 {

	public static void main(String[] args) {
		
		//int a[]= {5,3,4,7,8,9};
		
		List<Integer> list=Arrays.asList(2,3,1,4,5,6,3,4,5,6,7,2,7,10,14,12);
		/*
		 * for(int i=0;i<list.size();i++) System.out.println(list.get(i));
		 */
		/*
		 * Iterator i=list.iterator(); while(i.hasNext()) {
		 * System.out.println(i.next()); }
		 */
		/*
		 * for(Integer i1: list) System.out.println(i1);
		 */
		
		//list.parallelStream().skip(3).filter(x->x%2==0).limit(4).sorted().map(y->y*y).forEach(x->System.out.println(x));
		
		Stream<Integer> s=Stream.of(4,2,3,1,6,7,4,2,1,8,9,6,7,8);
		//s.filter(x->x<5).distinct().forEach(System.out::println);
		
		//List<Integer> newList=s.filter(x->x>5).distinct().collect(Collectors.toList());
		
		//newList.forEach(s1->System.out.println(s1));
		
		s.sorted(Collections.reverseOrder()).forEach(System.out::println);
		
		List<Bank> bankList=Arrays.asList(
				new Bank(10,"ICICI"),
				new Bank(05,"BankOfIndia"),
				new Bank(15,"AXIS"),
				new Bank(20,"HSBC"),
				new Bank(25,"HDFC"),
				new Bank(12,"KOTAK"));
		Comparator<Bank> bankIdComp=(b1,b2)->b1.name.compareTo(b2.name);
		bankList.stream().sorted(bankIdComp).forEach(b->System.out.println(b));
		
		
	}

}
