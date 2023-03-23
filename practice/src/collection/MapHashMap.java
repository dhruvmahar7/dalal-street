package collection;

import java.util.HashMap;
import java.util.Map;

public class MapHashMap {
public static void main(String[]args) {
//used for keys and value.
//insertion is not maintained.
//searching is high in HashMap
//	HashMap h=new HashMap();
HashMaph<Integer,String>=new HashMap();
	
	h.put(101, "john");	
	h.put(102, "johnny");	
	h.put(103, "jenny");	
h.put(104, "josh");	
h.put(105, "yoyo");	
h.put(106, "john");
//System.out.println(h);
//System.out.println(h.get(103));	
//System.out.println(h.remove(106));	
//System.out.println(h.containsValue("john"));
//System.out.println(h.keySet());//shows all key
//System.out.println(h.values());
//System.out.println(h.entrySet());
//for(Object value:h.values()) {
//System.out.println(value);	

//for(Object key:h.keySet()) {
//System.out.println(key+"  "+h.get(key));	

for(Map.Entry en : h.entrySet()){
System.out.println(	en.getKey()+" "+en.getValue());

}}}
