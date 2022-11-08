package Day41;
class DebitCard
{
	long number=85296314787l;
	void swipe()
	{
		System.out.println("swipe to transact");
	}
}
class Bank
{
	void atm(DebitCard ref)
	{
		System.out.println("display account number");
		ref.swipe();
	}
}
public class Program7 {
	public static void main(String[]args)
	{
		Bank b1=new Bank();
		b1.atm(new DebitCard());
	}
}
