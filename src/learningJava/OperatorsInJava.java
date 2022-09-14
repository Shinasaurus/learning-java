package learningJava;

public class OperatorsInJava {

	public static void main(String[] args) {
		
		int myNumber = 10;
		String str = "String demo";

		int number1 = 10;
		int number2 = 20;
		number1++;
		number1--; 
		
		boolean bool = !true; //returns false 
		
		System.out.println(bool);
		System.out.println(number1 + number2);
		System.out.println(number1+str);
		System.out.println(number1/number2);
		
		if (number1!=number2) {
			System.out.println("Numbers are not equal");
		} else {
			System.out.println("Numbers are equal");
		}
		
		// && (and) ||(or)
		if (number1==10 && number2==21) {
			System.out.println("Either condition is met");
		}
	}

}