package logicalProgram;

public class SwapNumber {
public static void main(String[]args) {
int a=1;
int b=10;

//1st method by using third variable
int temp;

//temp=a;
//a=b;
//b=temp;
//System.out.println("a= "+a+", b= "+b);
//2nd by using brain :D

a=a+b;
b=a-b;
a=a-b;
System.out.print("a= "+a+" , b= "+b);



}
}
