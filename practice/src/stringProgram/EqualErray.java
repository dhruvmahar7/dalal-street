package stringProgram;

import java.util.Arrays;

public class EqualErray {
public static void main(String[]args) {
int a[]= {1,2,3};
int b[]= {1,2,3};

//boolean status=Arrays.equals(a, b);
//if(status==true) 
	//System.out.print("equal");

//	else 
	//	System.out.print("not equal");
	
//next approach
boolean status=true;
if(a.length==b.length) {
for(int i=0; i<a.length; i++) {	
if(a[i]!=b[i]) {
status=false;}}}
else {
status=false;}
if(status==true) {
System.out.print("equal");	
}
else {
	System.out.print("not equal");
}













}}
