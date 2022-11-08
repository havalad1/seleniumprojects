package Day45;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program1 
{
	public static void main(String[] args) 
	{
		try
		{
		System.out.println("hi this is the start");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
		System.out.println("a="+a);
		System.out.println("enter a number");
		int b=sc.nextInt();
		System.out.println("b="+b);
		int res=a/b; //risky code
		System.out.println("res="+res);
		System.out.println("hello are you in class");
		}
		catch(ArithmeticException ref)
		{
			System.out.println("exception handled");
		}
		catch(InputMismatchException ref)
		{
			System.out.println("input mismatch exception");
		}
		catch(Exception ref)
		{
			System.out.println("generic exeception");
		}
		System.out.println("this is the end");
	}
}
