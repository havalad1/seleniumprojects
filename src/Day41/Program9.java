package Day41;
class SimCard
{
	long number=8904327448l;
	void network()
	{
		System.out.println("network");
	}
}
class Mobile
{
	void operate(SimCard ref)
	{
		ref.network();
	}
}
public class Program9 {
	public static void main(String[] args) {
		Mobile m1=new Mobile();
		m1.operate(new SimCard());
	}

}
