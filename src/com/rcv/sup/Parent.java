package com.rcv.sup;

public class Parent {
	
	String empName ="Tom";
	int empNo=45345;
	
	public void getData() {
		
		System.out.println(empName);
		System.out.println(empNo);
	}
	
	public Parent() {
		
		System.out.println("Parent No argument Constructor");
	} 
	
	public Parent(int i) {
		
		System.out.println("Parameterized Parent Constructor");
	} 

}
