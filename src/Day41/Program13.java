package Day41;

class Day1
{
	void corejava()
	{
		System.out.println("java is difficult");
	} 
}
class Day41 extends Day1
{
	void corejava()
	{
		System.out.println("java is easy");
	}
}
public class Program13 {
	public static void main(String[] args) {
		Day1 ref=new Day41();//upcasting
		ref.corejava();
		
	}
}
