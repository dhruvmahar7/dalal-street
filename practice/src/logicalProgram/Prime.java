package logicalProgram;

public class Prime {
public static void main(String[]args) {
int a=31;
int count=0;
for(int i=1; i<=a; i++) {
if(a%i==0) {
count++;	
}}
if(count==2) {
System.out.print(a+ " is a prime number");
}
else {
	System.out.print(a+" is not prime number");

}
}}
