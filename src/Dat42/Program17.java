package Dat42;

class Exp1
{
	float r=3.4f;
}
class Exp2 extends Exp1
{
	void run()
	{
		System.out.println("run method....");
	}
}
class Demo15
{
	void test(Exp1 ref)
	{
		System.out.println(ref.r);
		Exp2 ref2=(Exp2)ref;
		ref2.run();
	}
}
public class Program17 
{
	public static void main(String[] args) 
	{
		Demo15 d15=new Demo15();
		d15.test(new Exp2());
	}
}
