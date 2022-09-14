package com.rcv.w3schoolconstructors;


/*
 * A constructor in Java is a special method that is used to initialize objects. 
 * The constructor is called when an object of a class is created.
 *  It can be used to set initial values for object attributes: 
 */
public class Main {
	
	
	public static void main(String[] args) {
		
		Main myObj = new Main();  // Create an object of class Main (This will call the constructor)
		
		System.out.println(myObj.x);
		
		/* Return in console: 
		 * "This is printing because the Constructor explicitly defined got called soon as object is created
		 * 5"
		 */
	}
	
	

    int x; // Create a class attribute

    // Create a class constructor for the Main class
	public Main() {
		
		x =5;  // Set the initial value for the class attribute x
		
		System.out.println("This is printing because the Constructor explicitly defined got called soon as object is created");
	}
}
