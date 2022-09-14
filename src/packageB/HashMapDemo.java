package packageB;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo{

public static void main(String[]  args){


HashSet hs1 = new HashSet();

hs1.add(null);
hs1.add(1);
hs1.add(true);
hs1.add('a');
hs1.add("dinner");
///hs1.add(1); set doesnot allow duplicate elements like this one. It won't throw an error, but will just get ignored. 
System.out.println(hs1.size());
System.out.println(hs1.contains(null));

System.out.println(hs1);

hs1.remove(true);
hs1.add(false);
hs1.add("Cook");

for (Object obj: hs1){

System.out.println(obj);

}

System.out.println();

Iterator itr1 = hs1.iterator();

while(itr1.hasNext()){

System.out.println(itr1.next());
}


System.out.println("Another integer hashset");

HashSet<Integer> hs2 = new HashSet<Integer>();

hs2.add(10);
hs2.add(11);
hs2.add(null);
hs2.add(12);
hs2.add(13);
hs2.add(12);


System.out.println(hs2.size());

for(Integer i: hs2){

System.out.println(i);
}



hs2.add(14);
hs2.remove(10);
hs2.add(15);

System.out.println("The new size is: " + hs2.size());

Iterator<Integer> itr2 = hs2.iterator();

while (itr2.hasNext()){

System.out.println(itr2.next());

}


}





}






