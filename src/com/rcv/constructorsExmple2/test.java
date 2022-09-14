package com.rcv.constructorsExmple2;

public class test {
	
	public static void main(String[] args) {
		
		Student s = new Student(); 
		/* returns: 
		 * Person class constructor
		 *Student class constructor */

	}
	
	
	
	
	/*Call to super() must be first statement in Derived(Student) Class constructor.
	If a constructor does not explicitly invoke a superclass constructor, 
	the Java compiler automatically inserts a call to the no-argument constructor of the superclass. 
	If the superclass does not have a no-argument constructor, you will get a compile-time error. Object does have such a constructor, 
	so if Object is the only superclass, there is no problem.
	If a subclass constructor invokes a constructor of its superclass, either explicitly or implicitly, 
	you might think that a whole chain of constructors called, all the way back to the constructor of Object. This, in fact, is the case. 
	It is called constructor chaining.. */

}
