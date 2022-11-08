package Day41;
class Javastudent
{
	void coding()
	{
		System.out.println("coding skills");
	}
}
class SeleniumStudent extends Javastudent
{
	void automationtesting()
	{
		System.out.println("testing skills");
	}
}
class Company
{
	void interview(Javastudent ref)
	{
		ref.coding(); 
	}
}
public class Program10 {
	public static void main(String[] args) {
		Company c1=new Company();
		c1.interview(new Javastudent());
		c1.interview(new SeleniumStudent());
	}
}
