package logicalProgram;

public class DuplicateChar {
public static void main(String[]args) {
String a="dheeraj";
char ch[]=a.toCharArray();
for(int i=0; i<a.length(); i++) {
for(int j=i+1; j<a.length();j++) {
if(ch[i]==ch[j]) {
System.out.println("Duplicate char= "+ch[j]);	
}
}
}
}
}
