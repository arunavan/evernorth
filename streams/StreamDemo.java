package com.evernorth.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		
		
		Stream<Integer> s=Stream.of(3,4,5,6,7,8,9);
		//s.forEach(x->System.out.println(x));
		//s.limit(3).forEach(System.out::println);
		
		s.filter(x->x<6).limit(2).forEach(y->System.out.println(y));
		Stream<Integer> s1=Stream.of(3,4,5,6,7,8,9);
		System.out.println("first 2 even ");
		s1.filter(x->x%2==0).limit(2).forEach(x->System.out.println(x));
		
		List<Integer> l=Arrays.asList(11,2,33,3,4,45,6,3,23,2,5,6,7,8,9);
		/*Iterator<Integer> i1=l.iterator();
		
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		for(int i=0;i<l.size();i++)
			System.out.println(l.get(i));
		for( Integer x: l)
			System.out.println(x);
		*/
		
		System.out.println(" even numbers below 5");
		l.stream().filter(x->x<=5).filter(x->x%2==0).map(x->x*x).forEach(x->System.out.println(x));
		
		
		Comparator<Integer> c=(x1,x2)->x2-x1;
		l.stream().sorted(c).forEach(x->System.out.print(x+" "));
		
		l.stream().sorted(Collections.reverseOrder()).forEach(x->System.out.print(x+" "));
		//l.parallelStream().distinct().filter(x->x>=5).map(x->x*x*x).forEach(System.out::println);
		l.stream().map(x->x*10).forEach(System.out::println);
		
		Optional<Integer> sum=l.stream().reduce((a,b)->a+b);
		System.out.println(sum.get());
		
		
		Long count=l.stream().filter(x->x>=10).count();
		System.out.println(count);
		
		
		List<Integer> above10list=l.stream().filter(x->x>=10).collect(Collectors.toList());
		above10list.forEach(System.out::println);
		
	}

}
