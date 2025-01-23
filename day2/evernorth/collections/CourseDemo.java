package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
//model

//Object  -- CourseTable
class Course{
	Integer id;
	String name;
	Double fee;
	public Course(Integer id, String name, Double fee) {
		super();
		this.id = id;
		this.name = name;
		this.fee = fee;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", fee=" + fee + "]";
	}
	
}

interface CourseService{
	String addCourse(Course c);
	String deleteCourse(Integer cid);
	String updateCourse(Integer cid);
	 List<Course> listCourses();
}
class CourseServiceImpl implements CourseService{
	List<Course> courseList=new ArrayList<>();
	public String addCourse(Course c) {
		courseList.add(c);
		return "Course Added successfully";
	}
	public String deleteCourse(Integer cid) {
		Iterator i=courseList.iterator();
		while(i.hasNext()) {
			Course course=(Course)i.next();
			if(course.id==cid)
				i.remove();
		}
		return "removed successfully";
	}
	public String updateCourse(Integer cid) {
		Iterator i=courseList.iterator();
		while(i.hasNext()) {
			Course course=(Course)i.next();
			if(course.id==cid)
				course.fee=course.fee+1000;
		}
		return "updated successfully";
	}
	 public List<Course> listCourses(){
		 return courseList;
	 }
}
//ui, test,run,client
public class CourseDemo {
	public static void main(String[] args) {
			Course c1=new Course(40,"Angular",5000.00);
			Course c2=new Course(50,"React",5000.00);
		CourseService cs=new CourseServiceImpl();
		System.out.println(cs.addCourse(c1));
		System.out.println(cs.addCourse(c2));
		List<Course> returnedList=cs.listCourses();
		//returnedList.forEach(x->System.out.println(x));
		for ( Course c:returnedList)
			System.out.println(c);
		
		System.out.println(cs.deleteCourse(50));
		System.out.println(cs.updateCourse(40));
		List<Course> returnedList1=cs.listCourses();
		//returnedList.forEach(x->System.out.println(x));
		for ( Course c:returnedList1)
			System.out.println(c);
		
				
		
		
	}
}
