package Dat42;

class Demo11
{
	int a=90;
}
class Demo12 extends Demo11 
{
	void test()
	{
		System.out.println("test method");
	}
}

public class Program14 
{
	public static void main(String[] args) 
	{
		Demo11 d11=new Demo12();
		System.out.println(d11.a);//upcasting
		Demo12 d12=(Demo12)d11;//downcasting
		System.out.println(d12.a);
		d12.test();
	}
}
