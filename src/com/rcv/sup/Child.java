package com.rcv.sup;

public class Child extends Parent {

	String empName = "Abby";
	int empNo =65778;
	
	
	public static void main(String[] args) {
		
		Child c = new Child();
		
	   c.getData();
		
		System.out.println();
		
		c.getSuperData();
		
		
	}
	
	public void getData () {
		
		// User 'super'keyword to refer to method of parent class that has the same method name 
		super.getData();  
		
		System.out.println(super.empName); // Use 'super'keyword in Child class to 
		System.out.println(super.empNo);   // refer to variables of parent that have the same names
		
		System.out.println(empName);
		System.out.println(empNo);
	}
	
	public void getSuperData() {
		
		super.getData(); // Again, use 'super'keyword to refer to method of parent class that has the same method name 
		
	}
	
	//From Child Class, below is How to call explicitly defined parameterized Constructor of parent class
	
	public Child() {
		
	
		 super(5);	
		 
 System.out.println("This is child constructor ");

		
		//super();
		//super(); 
		//System.out.println("Accessing Parent constuctor from Child constructor ");
		
	} 
	
	
	
}
