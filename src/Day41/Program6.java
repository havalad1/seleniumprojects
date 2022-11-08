package Day41;
class Example1
{
	float e=4.5f;
	}
class Example2 extends Example1
{
	void task()
	{
		System.out.println("task method");
	}
	}
class Example3 extends Example2
{
	String name="hello";
	void disp()
	{
		System.out.println("display method..........");
	}
	}
public class Program6 {
	public static void main(String[] args) {
		Example3 e3=new Example3();
		System.out.println(e3.name);
		e3.disp();
		e3.task();
		System.out.println(e3.e);
		System.out.println("----------------------");
		Example2 e2=e3;
		e2.task();
		System.out.println("-----------------------");
		Example1 e1=e2;
		System.out.println(e1.e);
		
		Object ob=e1;
	}
}
