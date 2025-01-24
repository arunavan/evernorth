package com.evernorth.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee{
	Integer id;
	String name;
	Double Salary;
	String desg;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return Salary;
	}
	public void setSalary(Double salary) {
		Salary = salary;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public Employee(Integer id, String name, Double salary, String desg) {
		super();
		this.id = id;
		this.name = name;
		Salary = salary;
		this.desg = desg;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Salary=" + Salary + ", desg=" + desg + "]";
	}
	
	
}

public class StreamDemo1 {

	public static void main(String[] args) {
		
		List<Employee> elist=Arrays.asList(new Employee(10,"ram",99999.99,"SE"),
				new Employee(15,"arun",39999.99,"SSE"),
				new Employee(20,"raj",99999.99,"SE"),
				new Employee(14,"kiran",89999.99,"Associate"),
				new Employee(24,"vedik",89999.99,"Associate"),
				
				new Employee(12,"bindu",39999.99,"PM"),
				new Employee(13,"bindu",29999.99,"Dev"),
				new Employee(23,"Vineeth",29999.99,"Dev"),
				new Employee(11,"bindu",19999.99,"QA"),
				new Employee(11,"bindu",19999.99,"QA"),
				new Employee(11,"bindu",19999.99,"QA"),
				new Employee(11,"bindu",19999.99,"QA"),
				new Employee(13,"john",79999.99,"QA")
				);
		
		elist.stream().forEach(e->System.out.println(e));
		// name- kiran
		System.out.println(" kiran details===================");
		
		elist.stream().filter(e->e.getName().equals("kiran")).forEach(e->System.out.println(e));
		
		System.out.println(" salary > 60000===================");
		
		elist.stream().filter(e->e.getSalary()>60000.00).forEach(e->System.out.println(e));
		//uppercase
		
		List<String> namelist=elist.stream().map(e->e.getName().toUpperCase()).filter(x->x.length()>=4).collect(Collectors.toList());
		namelist.forEach(System.out::println);
		
		
		System.out.println(" after sorting by id ");
		//Comparator<Employee> com=(e1,e2)->e1.getId()-e2.getId();
		//Comparator<Employee> com=(e1,e2)->e1.getName().compareTo(e2.getName());
		//Comparator<Employee> com=(e1,e2)->e2.getSalary().intValue()-e1.getSalary().intValue();
		
		//sorting on multiple fields 
		elist.stream().sorted((Comparator.comparing(Employee::getName)).thenComparing(Comparator.comparing(Employee::getSalary))).forEach(System.out::println);
		
		   // desg, count
		//https://www.baeldung.com/java-groupingby-collector
		
		Map<String,List<Employee>>  emap=elist.stream().collect(Collectors.groupingBy(Employee::getDesg));
		System.out.println(emap);
		System.out.println(emap.keySet());
		for(String d:emap.keySet()) {
			System.out.println(d+  "  "+emap.get(d).size());
		}
	}

}


