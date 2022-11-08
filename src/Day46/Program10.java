package Day46;

import java.io.IOException;
import java.sql.SQLException;

class Department
{
	void forecast() throws IOException,SQLException,InterruptedException
	{
		System.out.println("forcast");
	}
}

public class Program10 
{
	public static void main(String[] args) 
	{
		Department d=new Department();
		try
		{
		d.forecast();
		}
		catch(IOException e)
		{
			System.out.println("exception occured and handled");
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
}
