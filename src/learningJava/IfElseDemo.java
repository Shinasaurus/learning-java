package learningJava;

public class IfElseDemo {

	public static void main(String[] args) {
		int numb1=40;
		int numb2=20;
		int numb3=30;
		
		if(numb1>numb2){
			
			System.out.println("Number 1 is greater than Number 2");// TODO Auto-generated method stub
		    
			if (numb2>numb3) {
		    	
		    	System.out.println("In nested 'IF' block");
		    } 
		    
			else {
		    	System.out.println("In nested 'ELSE' block");
		    }
			
		} else if (numb1==numb2) {
			
			System.out.println("Number 1 is equal to Number 2");
			
		}else if(numb1<numb2) {
			
			System.out.println("Number 1 is less than number 2");
		}else {
			System.out.println("In the final else block");
		}

	}

}
