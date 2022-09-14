package learningJava;

public class WhileLoopDemo {

	public static void main(String[] args) {
		
		int i = 1;
		
		while (i <= 10) {
			
			System.out.println(i);
			
			i++;
		}     // code execution loops between "while" and "i++" until condition i<=10 is no longer met. Then code moves on to "After while loop"line.
		
		System.out.println("After while loop");

	}

}
