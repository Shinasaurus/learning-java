package learningJava;

/*A method is a block of code which only runs when it is called.

You can pass data, known as parameters, into a method.

Methods are used to perform certain actions, and they are also known as functions.

Why use methods? To reuse code: define the code once, and use it many times.*/

public class MethodsDemo {

	
	public static void main(String[] args) {  
		
		MethodsDemo md = new MethodsDemo();
		
		   //static method belongs to the Class, not the object.Can be accessed without creating Object.
		
		System.out.println(doLogIn()); //prints "Login successful..." and "123"
		
		    //non-static methods belongs to object of the class, so object needs to be created to access non-static methods
		
		md.doLogOut();  // prints both "login successful" and "logout successful" 
		
		
		    //int total = md.addNumbers(56, 23); can also store it in variable 'total' and just print 'total'below  
		System.out.println(md.addNumbers(56, 23));
		
		md.differentParameters("This is the string", 356, 67987);

	}
	
	public static int doLogIn() {
		
		System.out.println("Login successful...");
		return 123;
	}
	
	public void doLogOut() {
		
		doLogIn();//a method can call another method. 
		System.out.println("Logout successful");
		
	}
	
	public int addNumbers(int x, int y ) {
		//  int z = x+y; can also create 'z' variable like this, then return 'z' below instead 
		return x+y;
		
	}
	
	public void differentParameters(String s, int i, float f) {
		System.out.println(s);
		System.out.println(i);
		System.out.println(f);
	}

}
