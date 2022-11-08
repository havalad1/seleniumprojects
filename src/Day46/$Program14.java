package Day46;

import java.util.Scanner;

public class $Program14 
{
	public static void main(String[] args) 
	{
		long [] n= {123,369,748,256,789};
		
		long sum=0;
		for (int i = 0; i < n.length; i++) 
		{
			sum=sum+n[i];
		}
		System.out.println("sum: "+sum);
	}
}
