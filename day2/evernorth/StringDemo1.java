package com.evernorth;

import java.util.Date;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class StringDemo1 {

	public static void main(String[] args) {
		
		String s1=new String("Evernorth"); //
		String s="evernorth";
		String s2=s1;
		System.out.println(s1.concat("tehcnologies")); // new object 
		System.out.println(s1);
		System.out.println(s1.replace('e','a')); //1
		System.out.println(s.toUpperCase());
		System.out.println(s.concat("tehcnologies")); // new object 
		System.out.println(s);
		System.out.println(s.replace('e','a')); //1
		System.out.println(s.toUpperCase());
		//s=null;
		System.out.println(s.charAt(2));
		System.out.println(s1.indexOf('o'));
		System.out.println(s.length());
		
		StringBuilder sb=new StringBuilder(s1);
		sb.append(989);
		sb.append("java");
		sb.append(new Date());
		System.out.println(sb);
		sb.insert(3,"aaaa");
		System.out.println(sb);
		sb.delete(3,8);
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.ensureCapacity(100);
		System.out.println(sb.capacity());
		
		System.out.println(sb.reverse());
		System.out.println(sb.toString().toUpperCase());
		
		StringBuffer sb1=new StringBuffer(s);//slow, multithreaded
		String sb2=sb1.toString();
		
		
		System.out.println(s1.matches("a"));
		
		String address="Evernorth-Hyderabad-India";
		String tokens[]=address.split("-");
		for( String ss:tokens)
			System.out.println(ss);
		
		StringTokenizer st=new StringTokenizer(address,"-");
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());
		
		StringJoiner sj=new StringJoiner(",");
		sj.add("java");
		sj.add("spring");
		sj.add("jpa");
		System.out.println(sj.toString());
		
		
	}

}

