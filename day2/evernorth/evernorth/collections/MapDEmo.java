package com.evernorth.collections;
import java.util.*;
public class MapDEmo {

	public static void main(String[] args) {
		
		Map<Integer,String> map=new HashMap<>();
		map.put(3,"java");
		map.put(2,"python");
		map.put(21,"python");
		map.put(22,"python");
		map.put(1,"spring");
		map.put(2,"microservices");
		map.put(null,"oracle");
		System.out.println(map);
		Collection vals=map.values();
		System.out.println(vals);
		
		
		System.out.println(map.get(2));
		Set keys=map.keySet();
		System.out.println(keys);
		Set entries=map.entrySet();
		
		Iterator i=entries.iterator();
		while(i.hasNext()) {
			Map.Entry entry=(Map.Entry)i.next();
			System.out.println(entry.getKey() +"  "+entry.getValue());
		}

	}

}
