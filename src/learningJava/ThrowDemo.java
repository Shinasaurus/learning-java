 package learningJava;

public class ThrowDemo {
	
	
  int[] myNumbers = {1, 2, 3};
  

	public void printArrayElment(int i) {

	if (i<0 ||i>2){

	throw new ArrayIndexOutOfBoundsException("Moron, Array Index given is out of Bounds");} else {

	System.out.println(myNumbers[i]);}

	}


	  public static void main(String[] args) {
	    
		ThrowDemo td = new ThrowDemo();
		
	    td.printArrayElment(0);

}
}
