package logicalProgram;

public class CheckChar {
public static void main(String[]args) {
char ch='1';
char al;
for(al='a'; al<='z'; al++) {
if(ch==al) {
System.out.print(ch+" is alphabet");break;
}
else {
System.out.print(ch+" is not alphabet");break;
}
}
}	
}

