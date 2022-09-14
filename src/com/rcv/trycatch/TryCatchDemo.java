package com.rcv.trycatch;

public class TryCatchDemo {
	
	
/* The try statement allows you to define a block of code to be tested for errors while it is being executed.

The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.

The try and catch keywords come in pairs:

try { 
       block of code to try    } catch (Exception e) {
       
      block of code to handle errors }
      
      The finally statement lets you execute code, after try...catch, regardless of the result: */
	
	public static void main(String[] args) {
		int i=10;
		
		System.out.println("Before try catch block, Hahaha...");
		try {
			
			System.out.println(i/0);
			
			/* Below: "Throwable" is a Super Class in java documentation that handles errors and exceptions , "t" is its obeject.
			 *  Here they can also be replaced by "Exception" (a subclass of "Throwable") and "e" (object of the "Exception" class)
			 */
			
		}catch(Throwable t) {  
			
			System.out.println("Cause is " + t.getCause());
			System.out.println("Message from Java is " + t.getMessage());
			t.printStackTrace(); 
			System.out.println("Division by 0 is invalid, fool!");
			
		}finally {
			
			System.out.println("This is the finally block, which gets executed regardless an error/exception happens or not.");
		}  
		
		System.out.println("After try catch block");
	}

}
