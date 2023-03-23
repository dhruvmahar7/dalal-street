package logicalProgram;

public class LCm {
public static void main(String[]args) {
int a=22;
int b=33;
int gcd = 0;
int lcm;
for(int i=1; i<=a; i++) {
if(a%i==0&&b%i==0) {
gcd=i;	
}
}
lcm=(a*b)/gcd;
System.out.print(lcm);
}
}
