package Day41;

class NormalTicket
{
	void travel()
	{
		System.out.println("travel");
	}
}
class ResrvedTicket extends NormalTicket
{
	void berth()
	{
		System.out.println("berth provided");
	}
	void food()
	{
		System.out.println("food available");
	}
}
class AcTicket extends ResrvedTicket
{
	void temperaturecontrol()
	{
		System.out.println("set the temperature");
	}
}
class Train
{
	void generalcompartment(NormalTicket n1)
	{
		n1.travel();
	}
	void reservedcompartment(ResrvedTicket r1)
	{
		r1.travel();
		r1.berth();
		r1.food();
	}
	void accompartment(AcTicket a1)
	{
		a1.travel();
		a1.berth();
		a1.food();
		a1.temperaturecontrol();
	}
}
public class Program12 {
	public static void main(String[] args) {
		Train t1=new Train();
		t1.generalcompartment(new NormalTicket());//same class object
		t1.generalcompartment(new ResrvedTicket());//sub class object
		t1.generalcompartment(new AcTicket());//sub class object
		System.out.println("----------------------------");
		//t1.reservedcompartment(new NormalTicket());//super class object
		t1.reservedcompartment(new ResrvedTicket());//sub class object
		t1.reservedcompartment(new AcTicket());//sub class object
		System.out.println("-------------------------------");
		//t1.accompartment(new NormalTicket());//super class object
		//t1.accompartment(new ResrvedTicket());//super class object
		t1.accompartment(new AcTicket());//same class object
	}

}
