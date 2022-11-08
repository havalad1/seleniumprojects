package day39;

class MilitaryOperation 
{
	private String name;
	private int noofpeople;
	private float location;
	public MilitaryOperation(String name,int noofpeople,float location)
	{
		this.name=name;
		this.noofpeople=noofpeople;
		this.location=location;
	}	
		public String getName()
		{
			System.out.println("validate code provide access");
			return name;
		}
		public int getnoofpeople()
		{
			System.out.println("validate code provide access");
			return noofpeople;
		}
		public float getLocation()
		{
			System.out.println("validate code provide access");
			return location;
		}
		public void setName(String na)
		{
			System.out.println("validate code provide access");
			name=na;
		}
		public void setnoofpeople(int people)
		{
			System.out.println("validate code provide access");
			noofpeople=people;
		}
		public void setLocation(float loca)
		{
			System.out.println("validate code provide access");
			location=loca;
		}
}
