package learningJava;

public class NestedLoopDemo {

	public static void main(String[] args) {

		int count = 0;

		for (int i = 1; i <= 4; i++) {

			int j = 1;

			while (j <= 5) {

				int k = 1;

				do {

					System.out.println("Value of i is " + i + "/ Value of j is " + j + " (Little k is " + k + ")");
					k++;
					count++;

				} while (k <= 3);

				/*
				 * System.out.println(); System.out.println("Iteration no.: " + count);
				 */

				j++;

			}

		}

		System.out.println();

		System.out.println("The total count of iterations is: " + count);
	}

}
