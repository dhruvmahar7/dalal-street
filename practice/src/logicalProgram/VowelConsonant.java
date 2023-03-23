package logicalProgram;

import java.util.Scanner;

public class VowelConsonant {

public static void main(String[] args) {
Scanner x=new Scanner(System.in);
System.out.println("enter any alphabet ");
char ch=x.next().charAt(0);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
System.out.print(ch+" is a vowel");	
}
else{
		System.out.print(ch+" is consonant");
	}
	}

}
