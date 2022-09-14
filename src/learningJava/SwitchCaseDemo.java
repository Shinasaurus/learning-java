 package learningJava;

public class SwitchCaseDemo {

	public static void main(String[] args) {

		/*
		 * switch (expression) { case 1: statement;
		 * 
		 * Case 2: statement;
		 * 
		 * default: statement; }
		 * 
		 * breaks and default are optional.but WITHOUT break after a case, if this case
		 * is satisfied, the rest of the switch statement will also run.
		 */

		/*
		 * int day = 3;
		 * 
		 * switch (day) { case 1: System.out.println("Mon");
		 * 
		 * case 2: System.out.println("Tue");
		 * 
		 * case 3: System.out.println("Wed");
		 * 
		 * case 4: System.out.println("Thu");
		 * 
		 * case 5: System.out.println("Fri");
		 * 
		 * case 6: System.out.println("Sat");
		 * 
		 * case 7: System.out.println("Sun");
		 * 
		 * default: System.out.println("Please input number 1 to 7");
		 * 
		 * }
		 */

		int day = 7;
		switch (day) {

		case 1:
			System.out.println("Mon");
			break;

		case 2:
			System.out.println("Tue");
			break;

		case 3:
			System.out.println("Wed");
			break;

		case 4:
			System.out.println("Thu");
			break;

		case 5:
			System.out.println("Fri");
			break;

		case 6:
			System.out.println("Sat");
			break;

		case 7:
			System.out.println("Sun");
			break;

		default:
			System.out.println("Please enter number 1 to 7"); // no need for break after default

		}

		char ch = 'T';

		switch (ch) {
		case 'D':
			System.out.println("You fail");
			break;

		case 'C':
			System.out.println("Try harder");
			break;

		case 'B':
			System.out.println("Not bad");
			break;
		case 'A':
			System.out.println("Bravo!!!");
			break;

		default:
			System.out.println("Enter letter A to D");

		}

	}
}
