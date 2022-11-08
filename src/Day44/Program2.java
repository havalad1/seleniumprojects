package Day44;

class CurrencyNote
{
	String color;
	int value;
	int serialno;
	public CurrencyNote(String color, int value, int serialno) 
	{
		this.color = color;
		this.value = value;
		this.serialno = serialno;
	}
	public boolean equals(Object ob)
	{
		CurrencyNote ct=(CurrencyNote)ob;
		return this.serialno==ct.serialno;
	}
}

public class Program2 
{
	public static void main(String[] args) 
	{
	 CurrencyNote c1=new CurrencyNote("pink",2000,9876);
	 CurrencyNote c2=new CurrencyNote("pink",2000,9876);
	 System.out.println(c1==c2);
	 
	 boolean res=c1.equals(c2);
	 System.out.println(res);
	 
	}
}
