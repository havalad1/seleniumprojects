package day43;

class RedBusApp 
{
	public RedBus ticketbooking(char select)
	{
		if(select == 'v')
		{
			return new Vrl();
		}
		else
		{
			return new Srs();
		}
	}
	
}
