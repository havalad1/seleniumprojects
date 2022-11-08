package Dat42;

class TravelAssociation
{
	void cabservice()
	{
		System.out.println("cab service");
	}
}
class Ola extends TravelAssociation
{
	void cabservice()
	{
		System.out.println("welcome to ola");
	}
}
class Uber extends TravelAssociation
{
	void cabservice()
	{
		System.out.println("welcome to uber");
	}
}
class User
{
	void travel(TravelAssociation ref)
	{
		ref.cabservice();
	}
}

public class Program19 
{
	public static void main(String[] args) 
	{
		User u=new User();
		u.travel(new Uber());
		u.travel(new Ola());
	}
}
