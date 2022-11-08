package Day46;

public class $Program15 
{
	public static void main(String[]args)
	{
		long [] a= {125,325,658,965,789};
		
		int b=658;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]==b)
			{
				System.out.println("present");
				System.exit(0);
			}
		}
		System.out.println("not present");
	}
}
