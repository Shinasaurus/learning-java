package com.rcv.constructors;

public class ConstructorExamples {
	
	//Constructors must have the same name with Class name
	
	// Constructors must have NO data type (e.g: void, int, etc.) 
	// A constructor can have no parameters or as many parameters as possible. 
	 
	int x;
	
	public ConstructorExamples() {
		
		System.out.println("explicitly defined constructor with no arguments/parameters");
	} 
	
	public ConstructorExamples(int i) {
		
		x=i;
		
		System.out.println("explicitly defined consturctor with integer parameter");
		
		
	}
	
	public ConstructorExamples(String s) {
		
		System.out.println("explicitly defined constructor with string parameter ");
	} 
	
	public ConstructorExamples(char ch, int i) {
		
		System.out.println("explicitly defined constructor with two parameters: 1 charactor and 1 interger");
	} 
	

	public static void main(String[] args) {
				
/* WHEN there is no constructor explicitly defined for a class:
		 
when an object of the class like below 'ConstructorExamples ce = new ConstructorExamples();' is created, Default constructor (created by java) of the class
is automatically called. (even tho running this class with just this object below now will return nothing in console.) */
		
/* However, soon as any constructor (with OR without parameters) is explicitly defined for a class, when an object of the class like below 'ConstructorExamples ce = new ConstructorExamples();' is created, default constructor of the class
will not get called. See and try to run with above explicitly defined Constructors. */
		 
		 ConstructorExamples ce = new ConstructorExamples(); 
		 
		 ConstructorExamples cei = new ConstructorExamples(8);
		 
		 ConstructorExamples ces = new ConstructorExamples("cute string");
		 
		 ConstructorExamples cechi = new ConstructorExamples('A', 9);
		 
		 System.out.println("Value of x is " + cei.x);
		 
	}
	
	
}

