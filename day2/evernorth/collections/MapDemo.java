package com.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<>();
		map.put(1, "java");
		map.put(4, "j2ee");
		map.put(8, "python");
		map.put(2, "sql");
		map.put(8, "java");
		map.put(8, "java");
		map.put(6, "java");
		map.put(7, null);
		map.put(8, "Webservices");
		System.out.println(map);
		Set keys=map.keySet();
		System.out.println(keys);
		Collection vals=map.values();
		System.out.println(vals);
		Set kvset=map.entrySet();
		Iterator i=kvset.iterator();
		while(i.hasNext()) {
			Map.Entry entry=(Map.Entry)i.next();
			System.out.println(entry.getKey()   +"  "+entry.getValue());
		}
		

	}

}
