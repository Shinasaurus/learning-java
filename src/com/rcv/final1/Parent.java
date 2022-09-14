package com.rcv.final1;

public  class Parent { // if "final" keyword is used between "public" and "class", then parent class cannot be inherited by any class. 

	
	public int i = 20;
	
	public final void setData() {
		
		System.out.println(i);
	}
}
