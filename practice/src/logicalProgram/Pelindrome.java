package logicalProgram;

public class Pelindrome {
public static void main(String[]args) {
int a=111; int n=a;
int rev=0;
while(a!=0) {
rev=rev*10+a%10;
a=a/10;
}
if(n==rev) 
System.out.print(n+" is pelindrome");	

else 
System.out.print(n+" is not pelindrome");
}
}


