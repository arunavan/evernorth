package com.collections;
import java.io.*;

// Sample for multi value annotation:
// Custom annotation declaration
/*
@interface books_data
{
    // No variable declared here
}
 */
/*@interface books_data
{
    // Single variable declaration
    String book_name();
}
*/
@interface books_data
{
    // Multiple variable declarations
    String book_name();
    int book_price();
    String author();
}
 
/*
@interface books_data
{
 
    // Custom annotation declaration
    String book_name() default "Effective Java";
 
    // Declaring the default values
    int book_price() default 30;
    String author() default "Joshua Bloch";
 
    // Multiple variable declaration
}
*/
// Main class
public class AnnotationDemo1 {
	
	
	    public static void main(String[] args)
	    {
	        // Print statement
	        System.out.println(
	            "example of multi value Annotation.");
	    }
	}