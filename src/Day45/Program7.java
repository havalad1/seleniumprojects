package Day45;

class Contractor
{
	void constructroad()
	{
		System.out.println("construct the road");
		int a=1/0; //risky code
	}
}
class Ministery
{
	void developmentwork()
	{
		System.out.println("develop the state");
		Contractor c1=new Contractor();
		c1.constructroad();
	}
}
class ChiefMinister
{
	void governstate()
	{
		System.out.println("govern the state");
	}
}

public class Program7 
{
	public static void main(String[] args) 
	{
		System.out.println("people.....");
		ChiefMinister cm=new ChiefMinister();
		try
		{
		cm.governstate();
		}
		catch(ArithmeticException ref)
		{
			System.out.println("exception handled by people");
		}
	}
}
