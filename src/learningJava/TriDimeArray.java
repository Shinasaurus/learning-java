package learningJava;

public class TriDimeArray {

	public static void main(String[] args) {
    
		String[][][] myStringArray = new String[2][3][2];
		
		myStringArray[0][0][0]="aa";
		myStringArray[0][0][1]="bb";
		myStringArray[0][1][0]="cc";
		myStringArray[0][1][1]="dd";
		myStringArray[0][2][0]="ee";
		myStringArray[0][2][1]="ff";
		myStringArray[1][0][0]="gg";
		myStringArray[1][0][1]="hh";
		myStringArray[1][1][0]="ii";
		myStringArray[1][1][1]="jj";
		myStringArray[1][2][0]="kk";
		myStringArray[1][2][1]="ll";
		
		int count=0;
		for (int i=0; i<myStringArray.length; i++) {
			
			for (int j=0; j<myStringArray[i].length; j++) {
				
				for (int k=0; k<myStringArray[i][j].length; k++) {
					
					System.out.println(myStringArray[i][j][k]);
					count++;
				}
			}
		}
				
        System.out.println("The total number of elements is " + count );
        
        
        String[][][] myTriArray= {{{"aa","bb"},{"cc","dd"},{"ee","ff"}},{{"gg","hh"},{"ii","jj"},{"kk","ll"}}};
        
        int count2=0;
        
        for (int i=0;i<myTriArray.length;i++) {
        	
        	for(int j=0;j<myTriArray[i].length; j++) {
        		
        		for(int k=0;k<myTriArray[i][j].length;k++) {
        			
        			System.out.println(myTriArray[i][j][k]);
        				count2++;
        			
        		}
        		
        	}
        	
        }
        
        System.out.println("The total number of elements is "+ count2);
	}

}
