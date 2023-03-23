package logicalProgram;

public class LeapYear {
public static void main(String[]args) {
int year=1700;

if(year%400==0) {
	System.out.print(year+" is a leap year");
}
else if((year%4==0)&&(year%100!=0)) {
	System.out.print(year+" is a leap year");
}
else {
	System.out.print(year+" is not a leap year");
}
}

}
