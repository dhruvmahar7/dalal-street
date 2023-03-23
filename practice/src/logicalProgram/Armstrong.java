package logicalProgram;

public class Armstrong {
public static void main(String[]args){
int a=153; int n=a;
int r;
int arm=0;
while(a!=0) {     
r=a%10;                   //
arm=arm+r*r*r;
a=a/10;
}
if(arm==n) {
System.out.print(n+" is pelindrome");	
}
else {
System.out.print(n+ " is not pelindrome");
}	
}
}
