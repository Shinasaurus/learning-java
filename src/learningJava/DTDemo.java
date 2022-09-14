package learningJava;

public class DTDemo {
	public static void main(String[] args) {
		
		// 8 primitive data types
		
		byte bt = -128;
		short st = 32767;
		int myInt = 764765;
		long lng =756737l;
		
		float myFloat = 1.4f;
		
		double myDouble = 1.455656d;
		
		boolean bool= false;
		char ch = 'c';
		
		//non-primitive/reference data types
		
		DTDemo dtd = new DTDemo();
		
		String str = new String();
		
		String str1 = " 'This is first string. ";
		
		System.out.println(str1.getClass());
		System.out.println(str1.indexOf('i'));
		System.out.println(str1.codePointAt(1));
		System.out.println(str1.hashCode());
		System.out.println(str1.isBlank());
		System.out.println(str1.length());
		System.out.println(str1.replaceAll("This is", "That was"));
		System.out.println(str1.toCharArray());
		System.out.println(str1.toUpperCase());
		System.out.println(str1.trim());
		System.out.println(str1.valueOf('f'));
		
		
		
		
	}
}
