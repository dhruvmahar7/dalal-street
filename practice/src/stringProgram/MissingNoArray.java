package stringProgram;

public class MissingNoArray {
public static void main(String[]args) {
int a[]= {1,2,4,5};
	int sum1=0;
for(int i=0; i<a.length; i++) {
sum1=sum1+a[i];
}
int sum2=0;
for(int i=1; i<=5; i++) {
sum2=sum2+i;
}
System.out.print("Missing number= "+(sum2-sum1));
}
}
