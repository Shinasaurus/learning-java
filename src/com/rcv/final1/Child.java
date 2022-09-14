package com.rcv.final1;

public class Child extends Parent {
	
	public final int x = 10;
	
	public static void main(String[] args) {
		
		Child c = new Child();
		  
	//  c.x=11; // with final keyword for i, vaule of i cannot be reassigned. 
		
		System.out.println(c.x);
		
		c.setData();
		
		c.i=21;
		
		c.setData();
		
	}
	
	/*public void setData() {
		
		System.out.println(i + x);
	} */

}
