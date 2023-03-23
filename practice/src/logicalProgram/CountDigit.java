package logicalProgram;

public class CountDigit {
public static void main(String[]args) {
int a=2353;
int count=0;

while(a!=0) {
a=a/10;
count++;	
}
a=a%10;
System.out.print(count);
	
}
	
}

