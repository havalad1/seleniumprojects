package Day46;

import java.io.IOException;

class Developer
{
	void coding() throws IOException
	{
		System.out.println("write the code");
		new IOException();
	}
}
class TeamLeader
{
	void assignproject() throws IOException
	{
		System.out.println("project assigned to teamleader");
		Developer d=new Developer();
		d.coding();
	}
}

class ProjectManager
{
	void completeproject() throws IOException
	{
		System.out.println("completed the projrct==> project managaer");
	
		TeamLeader tl=new TeamLeader();
		tl.assignproject();
		{
			System.out.println("project assigned");
		}
	}
}

public class Program9 
{
	public static void main(String[] args) 
	{
		System.out.println("management");
		try
		{
		ProjectManager pm=new ProjectManager();
		pm.completeproject();
		}
		catch(IOException ref)
		{
			System.out.println("exception handled");
		}
	}
}
