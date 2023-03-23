package collection;

import java.util.Hashtable;

public class HashTable {
public static void main(String[]args) {

Hashtable h=new Hashtable(); //capacity is 11 load factor=0.75
//Hashtable h1=new Hashtable(100,75);//capacity and load factor
h.put(101, "joker");
h.put(102, "hero");
h.put(103, "zero");
h.put(104, "any");
//System.out.println(h);
System.out.println(h.get(102));


}
}
