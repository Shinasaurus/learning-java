package com.rcv.w3schoolconstructors;

// In a Constructor you can have as many parameters as you want:

public class TwoParameterConstructor {
	
	int carYear;
	
	String modelName;
	
	char plateInitial;
	
	public TwoParameterConstructor(String name, int year) {
		
		carYear = year;
		
		modelName = name;
			
	}
	
	public static void main(String[] args) {
		
		TwoParameterConstructor tpc = new TwoParameterConstructor("Mustang", 1969);
		
		tpc.plateInitial = 'C';
		
		System.out.println("The car is "+ tpc.carYear + " " + tpc.modelName + ". Plate number starts with " + tpc.plateInitial);
		
	}
	

}
