package collection;

import java.util.HashSet;

public class Hashset {
	
public static void main(String[] args) {
      //Hashset
HashSet h=new HashSet();//default capacity=16, load capacity=12; 0.75
//can define capacity
//HashSet h1=new HashSet(100);
//HashSet h2=new HashSet(100,(float)0.90);//defining load factor too
//-------add object .element in the HashSet
h.add(1);
h.add("String");
h.add('a');
h.add(1.5);
//System.out.print(h); //insertion order is not maintained.
h.remove(1.5);
System.out.print(h);
//cannot use set because there is no role of index.
      
}
}