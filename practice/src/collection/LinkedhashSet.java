package collection;

import java.util.LinkedHashSet;

public class LinkedhashSet {
public static void main(String[]args) {
LinkedHashSet ls=new LinkedHashSet();//insertion is maintained
ls.add(1);
ls.add(3);
ls.add(2);
ls.add(2);
System.out.print(ls);// but duplicates are not allowed.
	
}
}
