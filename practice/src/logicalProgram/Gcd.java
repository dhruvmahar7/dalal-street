package logicalProgram;

public class Gcd {
public static void main(String[]args) {	
int a=20; 
int b=30;
int gcd=0;
//gcd
for(int i=1; i<=a; i++) {
if(a%i==0&&b%i==0) {
gcd=i;
}
}
System.out.print("gcd ="+gcd );
}
}
