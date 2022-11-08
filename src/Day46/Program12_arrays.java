package Day46;

public class Program12_arrays 
{
	public static void main(String[] args) 
	{
		long [] cn;
		
		cn=new long[5];
		
		cn[4]=123654;
		cn[1]=258963;
		cn[0]=741258;
		cn[2]=789654;
		cn[3]=987123;
		System.out.println(cn.length);
		for (int i = 0; i < cn.length; i++) 
		{
			System.out.println(cn[i]);
		}
	}
}
