package learningJava;

public class TenaryOperatorDemo {

	public static void main(String[] args) {
		int numb1=20;
		int numb2=40;
		/* if (numb1>numb2) {
			
			System.out.println("numb1>numb2");
	
		} else {
			System.out.println("numb1<numb2");
		} */
		
		/* Tenary operator: datatype(of output for trueExpression and FalseExpression) variable = (condition)? trueExpression : falseExpression
		   System.out.println(variable)*/
		
		String result1 = (numb1>numb2) ? "numb1>numb2" : "numb1<numb2";
		System.out.println(result1);
		
		boolean result2 = (numb1>numb2) ? true : false;
		System.out.println(result2);
		
		char result3 = (numb1>numb2) ? 'A' : 'B';
		System.out.println(result3);
	}

}
