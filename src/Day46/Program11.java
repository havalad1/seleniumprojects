package Day46;

class NotAttendedException extends Exception
{
	
}
class Interview
{
	void registration(boolean mock) throws NotAttendedException
	{
		if(mock==true)
		{
			System.out.println("allow student to register for the requirement");	
		}
		else
		{
			throw new NotAttendedException();
		}
	}
}
public class Program11 
{
	public static void main(String[] args) 
	{
		Interview ref=new Interview();
		try 
		{
			ref.registration(false);
		} 
		catch (NotAttendedException e) 
		{
			e.printStackTrace();
			System.out.println("go attend the mock first");
		}
	}
}
