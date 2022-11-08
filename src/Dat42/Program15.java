package Dat42;

class Sample11
{
	void end()
	{
		System.out.println("end method.....");
	}
}
class Sample12 extends Sample11
{
	double b=4.5d;
}
public class Program15 
{
	public static void main(String[] args) 
	{
		Sample11 s11=new Sample12();  //upcasting
		s11.end();
		Sample12 s12=(Sample12)s11;   //downcasting
		s12.end();
		System.out.println(s12.b);
	}
}
