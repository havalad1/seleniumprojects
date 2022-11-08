package day43;


interface Zomato
{
	void displaymenu();
	void takeorder();
	void delivery();
}
class McDonalds implements Zomato
{
	public void displaymenu()
	{
		System.out.println("welcome to mcdonalds");
		System.out.println("french fries");
		System.out.println("burger");
		System.out.println("coke");
	}
	public void takeorder()
	{
		System.out.println("add selected products to the kart");
		System.out.println("confirm the transaction");
		System.out.println("after successful transaction");
		System.out.println("issue the order to mcdonal kitchen");
		System.out.println("use the recipe to prepare food");
	}
	public void delivery()
	{
		System.out.println("once the food is prepared");
		System.out.println("hand it over from mcdonal kitchen to zomato delivery person");
	}
}
class Empire implements Zomato
{
	public void displaymenu()
	{
		System.out.println("welcome to empire");
		System.out.println("meals");
		System.out.println("chinese");
		System.out.println("india");
	}
	public void takeorder()
	{
		System.out.println("add selected products to the kart");
		System.out.println("confirm the transaction");
		System.out.println("after successful transaction");
		System.out.println("issue the order to empire kitchen");
		System.out.println("use the recipe to prepare food");
	}
	public void delivery()
	{
		System.out.println("once the food is prepared");
		System.out.println("hand it over from empire kitchen to zomato delivery person");
	}
}
class ZomatoApp
{
	public Zomato onlineorder(char select)
	{
		if(select=='m')
		{
			return new McDonalds();
		}
		else
		{
			return  new Empire();
		}
	}
}
public class Prgram20Sirs {
	public static void main(String[] args) {
		System.out.println("user................");
		ZomatoApp ref=new ZomatoApp();
		Zomato z=ref.onlineorder('e');
		
		z.displaymenu();
		z.takeorder();
		z.delivery();
	}
}
