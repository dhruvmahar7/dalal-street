package collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {
public static void main(String[]args) {
LinkedList l=new LinkedList();	//can store any kind of data.
//LinkedList <Integer> i=new LinkedList<Integer> ();	
//LinkedList<String> s=new LinkedList<String>();	
l.add(1);
l.add(4);
l.add(3);
l.add(2);
//in a proper manner
Collections.sort(l);
//System.out.println(l);
//in reverse manner
Collections.sort(l,Collections.reverseOrder());
System.out.println(l);
//insert/adding element int the middle of the list
l.add(2,"new");
//System.out.print(l);
//=====to get data-----------
//System.out.print(l.get(2));
// -----replace value-----------//////
l.set(0, "Start");
//System.out.print(l);
//System.out.print(l.contains('a'));
//System.out.print(l.isEmpty());
//========reading data by using loop.--------------
for(int i=0; i<l.size(); i++) {
//System.out.println(l.get(i));	
}
//=--------for each loop
for(Object e:l) {
//System.out.println(e);	
}
//iterator method//
Iterator i=l.iterator();
while(i.hasNext()) {
//System.out.println(i.next());	
}
LinkedList ll=new LinkedList();
ll.add("x");
ll.add("y");
ll.add("z");


LinkedList n=new LinkedList();
n.addAll(ll);
//System.out.println(n);

n.removeAll(ll);
//System.out.print(n.isEmpty());










































}
}
