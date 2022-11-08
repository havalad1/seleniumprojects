package Dat42;

class Sam1
{
	int a=23;
}
class Sam2 extends Sam1
{
	void task()
	{
		System.out.println("task method.........");
	}
}
class Sam3 extends Sam2
{
	double t=56.7;
	void run()
	{
		System.out.println("run method......");
	}
}
public class Program16 
{
	public static void main(String[] args) 
	{
		Sam1 ref=new Sam2();
		if(ref instanceof Sam3)
		{
			Sam3 s3=(Sam3)ref;
		}
		else
		{
			System.out.println("properties missing");
		}
		
		Sam1 s1=new Sam3();
		System.out.println(s1.a);
		
		Sam2 s2=(Sam2)s1;
		s2.task();
		System.out.println(s2.a);
		
		Sam3 s3=(Sam3)s2;
		s3.run();
		System.out.println(s3.t);
		s3.task();
		System.out.println(s3.a);
	}
}
