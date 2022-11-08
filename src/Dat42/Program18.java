package Dat42;

class WifiNetwork
{
	void providesignal()
	{
		System.out.println("provide signal");
	}
}
class AirtelExtreme extends WifiNetwork
{
	void providesignal()
	{
		System.out.println("AirtelExtreme implementation signal");
	}
}
class JioFibre extends WifiNetwork
{
	void providesignal()
	{
		System.out.println("JioFibre implementation signal");
	}
	
}
class ActFibre extends WifiNetwork
{
	void providesignal()
	{
		System.out.println("ActFibre implementation signal");
	}
}
class WifiRouter
{
	void catchsignal(WifiNetwork ref)
	{
		ref.providesignal();
	}
}

public class Program18 
{
	public static void main(String[] args) 
	{
		WifiRouter ref=new WifiRouter();
		ref.catchsignal(new  ActFibre());
		ref.catchsignal(new  JioFibre());
		ref.catchsignal(new  AirtelExtreme());
	}
}
