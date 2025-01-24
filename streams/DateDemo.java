package com.evernorth.streams;

import java.time.LocalDate;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		
		/*
		Date d=new Date();
		System.out.println(d);
		System.out.println(d.getDate());
		System.out.println(d.getYear());
		*/
		LocalDate d=LocalDate.now();
		System.out.println(d);
		LocalDate d1=LocalDate.of(2023, 10, 22);
		System.out.println(d.isAfter(d1));
		
		System.out.println(d1.plusMonths(3));
		
		System.out.println(d1.minusDays(50));

	}

}
