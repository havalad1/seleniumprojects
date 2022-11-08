package Day38Encapsulation;

class Nukes 
{
	private String pm;
	private String hm;
	private String president;
	private String dm;
	public void pwds(String pm, String hm, String president, String dm)
	{
		this.pm=pm;
		this.hm=hm;
		this.president=president;
		this.dm=dm;
	}
	public String getpm()
	{
		System.out.println("validate and confirm voice commamnd");
		return pm;
	}
	public String gethm()
	{
		System.out.println("validate and confirm voice commamnd");
		return hm;
	}
	public String getpresident()
	{
		System.out.println("validate and confirm voice commamnd");
		return president;
	}
	public String getdm()
	{
		System.out.println("validate and confirm voice commamnd");
		return dm;
	}
	public void setpm(String pm)
	{
		System.out.println("Validate and confirm command");
	}
	public void sethm(String hm)
	{
		System.out.println("validate and confirm command");
	}
	public void setpresident(String president)
	{
		System.out.println("validate and confirm command");
	}
	public void setdm(String dm)
	{
		System.out.println("validate and confirm command");
	}
	
	
}

