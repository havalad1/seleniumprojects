package Day38Encapsulation;

class AdharCard
{
	private String name;
	private int age;
	long adharnumber;
	public void adharcard(String name, int age, long adharnumber)
	{
		this.name=name;
		this.age=age;
		this.adharnumber=adharnumber;
	}
	public long getadhar()
	{
		System.out.println("generate and validate otp");
		return adharnumber;
	}
	public int getage()
	{
		System.out.println("genrrate and validate otp");
		return age;
	}
	public String getname()
	{
		System.out.println("genrrate and validate otp");
		return name;
	}
	public void setage(int ag)
	{
		System.out.println("genrrate and validate otp");
		age=ag;
	}
	public void setname(String na)
	{
		System.out.println("genrrate and validate otp");
		name=na;
	}
	public void setadharnumber(long adhar)
	{
		System.out.println("genrrate and validate otp");
		adharnumber=adhar;
	}
}
