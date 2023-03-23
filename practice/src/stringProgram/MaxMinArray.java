package stringProgram;

public class MaxMinArray {

public static void main(String[] args) {
int a[]= {12,43,23,15,32,46};
int max=a[0];	
//for(int i=1; i<a.length; i++) {
//if(a[i]>max) {
//max=a[i];	
//}
//}
//System.out.print("max= "+max);

//for min
int min=a[0];
for(int i=1; i<a.length;i++) {
if(a[i]<min) {
min=a[i];	
}
}

System.out.print("min= "+min);
}}
