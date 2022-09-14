package learningJava;

public class VariablesDemo {

	
	int j = 20; //INSTANCE variable, all methods within this class can access this variable. 
	public static void main(String[] args) {
		// dataType variableName = Value;

		int myNumb = 10;
		int secondNumb =10;
		char ch = 'A';
		String str1 = "RCV";
		// These above are LOCAL variables (defined within a specific method)
		
		System.out.println(str1 + myNumb); //returns "RCV10"
		System.out.println(myNumb + secondNumb); //returns 20;
 
	}

	public void myMethod() {
		int i = 20; // Again, i is a local variable with the scope of myMethod();
	}
	
	
}
