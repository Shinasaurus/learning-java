package packageB;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo {
	
	
	

	public static void main(String[] args) {
		
	 	ArrayList al = new ArrayList();
	 	
	 	al.add(0, 1);
	 	al.add(1, 2);
	 	al.add(true);
	 	al.add(3,true);
	 	al.set(1, "adj");
	 	
	 	System.out.println(al);
	 	
	 	for (int i=0; i<al.size();i++) {
	 		System.out.println(al.get(i));
	 	}
	 	
	 	for (Object obj: al) {
	 		
	 		
	 		System.out.println(obj);
	 	}
	 	
	 	Iterator iterator = al.iterator();
	 	
	/* 	while (iterator.hasNext()) {
	 		
	 	    System.out.println(iterator.next());
	 	} */
	 	

	 int h = (Integer) iterator.next();
	 int i= (Integer) al.get(0)+7;
	 
	 String str = (String)al.get(1)+ "tail....";
	 
	 boolean bl = (Boolean)al.get(2);
	 
	 System.out.println(h);
	 	}
	}


