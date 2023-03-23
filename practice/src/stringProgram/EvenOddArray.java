package stringProgram;

public class EvenOddArray {

public static void main(String[] args) {
int []a= {2,3,4,5,6};
for(int even:a) {
if(even%2==0)
	System.out.println("even= "+even);
}
for(int odd:a) {
if(odd%2!=0)
	System.out.println("odd= "+odd);


}
}}
