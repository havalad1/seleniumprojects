package day43;

public class MainOfRedBus 
{
	public static void main(String[] args) 
	{
		RedBusApp rba = new RedBusApp();
		RedBus rb=rba.ticketbooking('s');
		rb.redbuswebsite();
		rb.privatebusstation();
	}
}
