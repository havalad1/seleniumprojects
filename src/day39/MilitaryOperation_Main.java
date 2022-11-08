package day39;

public class MilitaryOperation_Main 
{
	public static void main(String[] args) 
	{
		MilitaryOperation mo=new MilitaryOperation("alpha",20,2563.9584f);
		System.out.println(mo.getName());
		System.out.println(mo.getnoofpeople());
		System.out.println(mo.getLocation());
		System.out.println("-------------------------------");
		mo.setName("bluestar");
		mo.setnoofpeople(25);
		mo.setLocation(8523.9637f);
		
		System.out.println(mo.getName());
		System.out.println(mo.getnoofpeople());
		System.out.println(mo.getLocation());	
	}
	
}
