package com.rcv.w3schoolconstructors;


/* Constructors can also take parameters, which is used to initialize attributes.
The following example adds an int y parameter to the constructor. 
Inside the constructor we set x to y (x=y). 
When we call the constructor, we pass a parameter to the constructor (5), which will set the value of x to 5:*/

public class ParameterizedConstructor {
	
	int x;
	
	public ParameterizedConstructor(int y) {
		
		x = y;
		
		System.out.println("This message proves that constructor with 'y' parameter is called when object is created");
	} 

	public static void main(String[] args) {
		
		ParameterizedConstructor pc = new ParameterizedConstructor(10);
		
		System.out.println(pc.x); 
		
		/* Return in Console: 
		 * "This message proves that constructor with 'y' parameter is called when object is created 
		 * 5" */
		 
	} 
}
