package learningJava;

public class BreakAndContinue {
	
	 //keyword: break and continue are only used in loops. (break is also used in SWITCH statement) 
	//keyword: break: breaks out of the loop for good, when the condition is met.
	//keyword: continue: breaks that 1 iteration of the loop, when the condition is met; and continues looping afterwards.
	
	public static void main(String[] args) {
		
		for(int i=1; i<=10;i++) {
			
			if (i==7) {
				break;
			}
			System.out.println(i);
		}
		
		System.out.println("After the break of for loop"); //print 1-6 then break out and print "After the break of for loop".
		
		int i=1;
		
		while (i<13) {
			
			if (i>9) {
				break;
			}
			
			System.out.println(i);
			i++;
			
		}
		
		System.out.println("After the break of while loop"); 
		
		/*print 1-9 then break out and print "After the break of while loop". Then continue onto Dowhile loop below
		print 10-14, finally break and print "After the break of dowhile loop" */
		
		do {
			if (i>=15) {
				break;
			}
			System.out.println(i);
			i++;
			
		} while(i<20);
		
		System.out.println("After the break of dowhile loop");
		
		
		/*continue is only used in For loop (it either causes infinite looping or doesn't change anything when used in while/dowhile loop) 
		her continue means 'n' will not get printed when n==5, instead code continues onto n--, then print 4,3... */
		for (int n=10; n>=0;n--) {
			
			if (n==5) {
				continue;
			}
			
			System.out.println(n);
			
		}
		
		System.out.println("End of 'n' For loop");
		
		/* int a=20;
		
		while (a<=30) {
			
			
			
			System.out.println(a);
			a++;
			
           if(a==25) {
				
				continue;
			}
		}
		
		System.out.println("outside of 'a' while loop");
		
		int b=40;
		
		do {
			
			
			System.out.println(b);
			b--;
			
			
		} while (b>35);
		
		System.out.println("Outside of 'b' Dowhile loop"); */
	}

}
