package Day41;

class NormalPass
{
	void entry()
	{
		System.out.println("entry to watch the event");
	}
}
class VipPass extends NormalPass
{
	void seating()
	{
		System.out.println("chairs available");
	}
	void food()
	{
		System.out.println("food stalls");
	}
}
class Event
{
	void gate1(NormalPass ref)
	{
		ref.entry();
	}
	void gate2(VipPass v1)
	{
		v1.seating();
		v1.seating();
		v1.food();
	}
}

public class Program11 {
	public static void main(String[] args) {
		Event e1=new Event();
		e1.gate1(new NormalPass()); //same class object
		e1.gate1(new VipPass()); //(sub class object)nothing but upcasting is happened.
		
		
		e1.gate2(new VipPass()); 
		//e1.gate2(new NormalPass()); //super class object not possible
	}

}
