package learningJava;

/* how While loop, Dowhile loop and For loop are used in practice in test automation:
 *
 *While loop is used for when you don't know the number of iterations
 *
 *Do while Loop is used for when you don't know the number of iterations
 *but you want to execute the code/statement at least once irrespective of the condition;
 *
 *For loop is used for when you know the number of iterations you want to run.
 *
 */

public class ForLoopDemo {

	public static void main(String[] args) {

		/*
		 * for loop syntax:
		 * 
		 * for(initiation; condition; update(increment/decrement){
		 * 
		 * statement}
		 * 
		 * Code executes from by first initiating (in =1), 
		 * then checking condition(i<=10), 
		 * to statement (print out i). 
		 * 
		 *Last to update (i++)
		 *
		 *After updating, restarting with condition (i <=10)...
		 */
        int i = 1;
		for (; i <= 10; ) {

			System.out.println(i);
			i++;

		}

		System.out.println("Outside FOR loop i");
		
	
 // OR following syntax is also correct
	   for (int a=10; a>=1;a--) {
		   System.out.println(a);
	   }
	   
	   System.out.println("Outside FOR loop a");
	   
	}
}
