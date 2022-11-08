package day43;
import java.util.Scanner;
public class Program22Sirs {
public static void main(String[] args) {
	Scanner ref=new Scanner(System.in);
	System.out.println("enter valid mobile number");
	long contactnumber=ref.nextLong();
	System.out.println("contactnumber="+contactnumber);
	
	System.out.println("enter the amount");
	double amt=ref.nextDouble();
	System.out.println("amt="+amt);
	System.out.println("enter the operator");
	String operator=ref.next();
	System.out.println("operator="+operator);
}
}
