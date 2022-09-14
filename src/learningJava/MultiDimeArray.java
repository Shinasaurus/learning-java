package learningJava;

public class MultiDimeArray {
	
	public static void main(String[] args) {
		
		// 1st ways of declaring a multi-dimension array:
		int[][] myMultiDimArray= new int[2][3]; //[][]here means: An outer Array (1st dimension array) has two elements of inner Arrays(2nd dimesion array) that each has 3 elements. 
	    myMultiDimArray[0][0]=2;
	    myMultiDimArray[0][1]=3;
	    myMultiDimArray[0][2]=5;
	    myMultiDimArray[1][0]=6;
	    myMultiDimArray[1][1]=8;
	    myMultiDimArray[1][2]=9;
	    
	    System.out.println(myMultiDimArray[1][1]);
	    System.out.println(myMultiDimArray.length);
	    
	    System.out.println("Below is how to loop through a multi-dimensional array");
	    
	    
	    for (int i=0;i<myMultiDimArray.length;i++) {
	    	
	    	for(int j=0;j<myMultiDimArray[i].length;j++) {
	    		
	    		System.out.println(myMultiDimArray[i][j]);
	    		
	    	}
	    };
	    
	    System.out.println("Same way to declare, the same multi-dimensional array");
	    
	    
	    //2nd way of declaring a multi-dimension array:
	    
	    int [][] myMultiDimArray1 = {{2,3,5},{6,8,9,10}};
	    
	    System.out.println(myMultiDimArray1[1][1]);
	    System.out.println(myMultiDimArray1.length);
	    
	    System.out.println("To loop through this two dimensional array with 3 + 4 = 7 integers ");
	    
	    for (int i=0; i<myMultiDimArray1.length; i++) {
	    	
	    	for (int j=0;j<myMultiDimArray1[i].length;j++) {
	    		
	    		System.out.println(myMultiDimArray1[i][j]);
	    	}
	    	
	    }
	    
	}
}
