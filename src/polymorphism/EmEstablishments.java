package polymorphism;

public class EmEstablishments 
{
	public static void main(String[] args) 
	{
		Society ref=new Society();
		ref.us(new SpaceX());
		ref.us(new Tesla());
		ref.us(new Boring());
		ref.us(new StarLink());
	}
}
