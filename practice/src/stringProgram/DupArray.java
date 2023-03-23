package stringProgram;

public class DupArray {
public static void main(String[]args) {
String arr[]= {"java","python","ruby","java"};	
//approach 1
for(int i=0; i<arr.length; i++) {
for(int j=i+1; j<arr.length; j++) {
if(arr[i]==arr[j])
System.out.print("Duplicate= "+arr[j]);	
}
}


}
}
