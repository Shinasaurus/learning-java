package com.rcv.trycatch;

public class TryCatchArray {
	
	int [] myNumb = {1, 2, 3};
	int i;
	
	
	public static void main(String[] args) {
		
		TryCatchArray tc = new TryCatchArray();
		
		tc.i=0;
		
		int x = tc.i;
		
		System.out.println("Before Try catch ");
		
		try {
			
			
			System.out.println(tc.myNumb[x]);
			
		}catch(Exception e) {
			
			System.out.println("Index no. out of bounds");
		}finally {
			System.out.println("This is the finally block");
		}
		
		System.out.println("After try catch and finally block ....");
	}

}
