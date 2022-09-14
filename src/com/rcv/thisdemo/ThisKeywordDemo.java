package com.rcv.thisdemo;

public class ThisKeywordDemo {
	
	int x;
	int y;
	String s="RCV";
	
	public static void main(String[] args) {
		
		ThisKeywordDemo tk = new ThisKeywordDemo(11, 22);
		tk.getData();
		
/* Returns:
Parameterized Constructor, with this keywrod the value of x and y CAN be passed to class attributes x and y
33
90
33
16 */
	}
	
	public void getData() {
		
		int x=50;
		int y=40;
		
		
		System.out.println(this.x+this.y); //Here "this" keyword is used to refer to class attributes x and y, to differentiate from same name local veraiables x and y of getDate() method 
		System.out.println(x+y);
		
		this.getData1(); //"this." can be explictly typeed out here or If not, the jvm will add it by default.
	}

public void getData1() {
		
		int x=5;
		int y=11;
		
		
		System.out.println(this.x+this.y);
		System.out.println(x+y);
	}


// Also "this" keyword can be used to intialize variables through constuctor.

public ThisKeywordDemo(int x, int y) {
	
	/* x=x;
	   y=y;
	
	   System.out.println("Parameterized Constructor, without this keywrod the value of x and y CANNOT be passed to class attributes x and y " + x+y); */
	
	/*Above would return: 
	  Parameterized Constructor, without this keywrod the value of x and y CANNOT be passed to class attributes x and y 112
      0
      90
      0
      16 */
	
	this.x=x;
	this.y=y;
	System.out.println("Parameterized Constructor, with this keywrod the value of x and y CAN be passed to class attributes x and y");
	
}
}
