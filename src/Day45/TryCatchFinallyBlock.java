package Day45;

public class TryCatchFinallyBlock 
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("join the course");
			System.out.println("login to class");
			System.out.println("concentrate in the class");
			//int a=1/0;
		}
		catch(ArithmeticException ref)
		{
			System.out.println("exception handled");
			System.out.println("concentrate in different class");
		}
		finally
		{
			System.out.println("learn the skill");
			System.out.println("attend the interview");
			System.out.println("get the job");
		}
	}
}
