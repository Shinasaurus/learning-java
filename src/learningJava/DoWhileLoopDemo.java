package learningJava;

public class DoWhileLoopDemo {
	
	public static void main(String[] args) {
		
		 /*difference bwt DoWhile loop & While loop is that code within "DO" 
		is executed at least once before condition after its "while"is checked. */
		
		int i=1;
		
		do {
			
		System.out.println(i);
		
		i++;
				
	} while(i>10);
		
		System.out.println("Outside DoWhile loop");
		
		
		while(i<10) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("Outside While loop");
		
	
		
		
	}
}

/* Return: 

1
Outside DoWhile loop
2
3
4
5
6
7
8
9
Outside While loop */
