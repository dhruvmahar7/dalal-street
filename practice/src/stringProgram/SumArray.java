package stringProgram;

public class SumArray {
public static void main(String[]args) {
int a[]= {1,2,3,4,5};
int sum=0;
for(int i=0; i<a.length; i++) {
sum=sum+a[i];	
}
System.out.println(sum);
//Enhanced for loop;

for(int b: a) {
sum=sum+b;	
}
System.out.print(sum);
}
}
