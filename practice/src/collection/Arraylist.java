package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Arraylist {
public static void main(String[] args) {

//Declare Arraylist
ArrayList al=new ArrayList(); //this will contain all type of 
                        // datatype , so hetrogenous.
ArrayList<String> s=new ArrayList<String> ();
// we can make it homogenous .in <> we can define datatype.
List l=new ArrayList();
//------can also use list for making reference variable for arraylist.

//---------add new element to the arraylist
al.add(1);
al.add("anyway");
al.add('a');
al.add(2.4);
al.add(false);
//System.out.print(al.size());	
al.remove(0);
//System.out.print(al.size());	
al.set(0, 2);
al.add(0, 1);
//System.out.print(al);
//==-------------searching value --
//System.out.print(al.contains(2.4));
//System.out.print(al.isEmpty());
//-------------------------for loop -------------
for(int i=0; i<al.size(); i++) {
//System.out.println(al.get(i));	
}
////-----------for each loop
for(Object e:al) {
//	System.out.println(e);
}
//    can use iterator
Iterator it=al.iterator();
while(it.hasNext()) {
//System.out.println(it.next());

Collections.sort(al);
System.out.print(al);

Collections.shuffle(al);

Collections.sort(al,Collections.reverseOrder());
// -----convert array to arrayList;
String []arr= {"dog","cat","cow"};
for(String animal: arr) {
System.out.print(animal);	
}

ArrayList li=new ArrayList(Arrays.asList(arr));//arr will convert.










	}

}}
