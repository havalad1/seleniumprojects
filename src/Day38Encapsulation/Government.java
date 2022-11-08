package Day38Encapsulation;

public class Government
{
	public static void main(String[] args)
	{
		AdharCard ac=new AdharCard();
		ac.adharcard("mark",25,123987852365l);
		System.out.println(ac.getadhar());
		System.out.println(ac.getage());
		System.out.println(ac.getname());
		
		ac.setadharnumber(789654123654l);
		ac.setage(28);
		ac.setname("killbill");
		
		System.out.println(ac.getadhar());
		System.out.println(ac.getage());
		System.out.println(ac.getname());
	}
}
