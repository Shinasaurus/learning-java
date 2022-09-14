package learningJava;

public class SingleDimenArray {

	public static void main(String[] args) {

		/*
		 * First way of declaring an array: (Index no. of array elements starts from 0,
		 * so e.g.: Array with 10 elements will have Index no. 0 to 9)
		 */

		int[] myIntArray = new int[10];

		myIntArray[0] = 9;
		myIntArray[1] = 20;
		myIntArray[2] = 30;
		myIntArray[3] = 40;

		System.out.println(myIntArray);
		System.out.println(myIntArray.length);

		System.out.println("Below is for loop");

		for (int i = 0; i < myIntArray.length; i++) {

			System.out.println(myIntArray[i]);
		}

		System.out.println();

		// Second way of declaring an Array:

		int[] myIntArray1 = { 100, 200, 300, 400, 500 };

		System.out.println(myIntArray1[0]);
		System.out.println(myIntArray1.length);

		System.out.println("Below is for loop");

		for (int i = 0; i < myIntArray1.length; i++) {
			System.out.println(myIntArray1[i]);

			// Third way of declaring an Array:

			int myIntArray2[] = { 1, 2, 3, 4, 5 }; // [] is used after name of the array, not after array data type.
													// This way is out-dated.

		}

		// Similarly, to declare a String Array:

		String[] myStringArray = new String[5];
		myStringArray[0] = "I";
		myStringArray[1]= "like";
		myStringArray[2]="going";
		myStringArray[3]="camping";
		myStringArray[4]=".";
		System.out.println("The second element in myStringArray is: "+ myStringArray[1]);
        System.out.println("The number of elements in myStringArray is: " + myStringArray.length);
        
        for (int i=0; i<myStringArray.length; i++) {
        	System.out.print(myStringArray[i]+ " "); // Return: I like going camping .
        	
        }
        
        System.out.println();
        
        char[] myCharArray = new char[7];
        myCharArray[0]='A';
        myCharArray[1]='B';
        myCharArray[2]='C';
        myCharArray[3]='D';
        myCharArray[4]='E';
        myCharArray[5]='F';
        myCharArray[6]='G';
       
       int i=0;
       while (i<myCharArray.length) {
    	   
    	  System.out.println(myCharArray[i]);
    	  i++;
       }
       
       System.out.println("Above is while loop of CharArray and below is its dowhile loop");
       
       int j=0;
       do {
    	   
    	   System.out.println(myCharArray[j]);
    	   j++;
    	   
       } while (j<myCharArray.length);
       
       for (char c: myCharArray ) {
    	   
    	   System.out.println("For each " + c);
       }
	}
	

}
