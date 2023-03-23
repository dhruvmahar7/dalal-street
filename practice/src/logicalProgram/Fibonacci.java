package logicalProgram;

public class Fibonacci {
public static void main(String[]args) {
//0,1,1,2,3,5,8		
int a=0; int b=1;
int fib;
for(int i=1; i<=10; i++) {	
fib=a+b;
System.out.print(a+" ,");
a=b;
b=fib;
}}
}