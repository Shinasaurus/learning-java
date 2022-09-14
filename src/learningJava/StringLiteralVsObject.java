package learningJava;

public class StringLiteralVsObject {

	public static void main(String[] args) {
       
		// String literals: Instead of creating a new/separate "RCV" for str3, str3 uses/points to the same "RCV" value in the Java heap that was already created for str1, to save memory) 
		String str1 = "RCV";
		String str3 = "RCV";
        
		// String objects: because word "new" is used to create a String object, a separate "RCV" value is created in the Java heap when str2 is created. Also a separate "RCV" value is created for str4. 
		String str2 = new String("RCV");
		String str4 = new String("RCV");
		
		System.out.println(str1 == str3 ); //returns true
		System.out.println(str1 == str2);  // returns false 
		System.out.println(str1.equals(str2)); //returns true 
		System.out.println(str2 == str4); //returns false
	}

}
