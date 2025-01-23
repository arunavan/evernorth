package com.collections;

import java.lang.reflect.Method;

public class MyAnnotationTest {
	    public static void main(String[] args) throws NoSuchMethodException {
	         Class<MyClass> x = MyClass.class;
            Method method = x.getMethod("myAnnotatedMethod");
          if (method.isAnnotationPresent(MyCustomAnnotation.class)) {
	            MyCustomAnnotation annotation = method.getAnnotation(MyCustomAnnotation.class);
          String value = annotation.value();
	            int count = annotation.count();
	            System.out.println("Annotation value: " + value);
	            System.out.println("Annotation count: " + count);
	        }
	    }
	}