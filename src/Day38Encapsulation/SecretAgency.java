package Day38Encapsulation;

public class SecretAgency 
{
	public static void main(String[]args)
	{
		Nukes nk=new Nukes();
		nk.pwds("alpha12alpha89","romeo89alpha","tango78alphabeta","camel51everest");
		System.out.println(nk.getpm());
		System.out.println(nk.gethm());
		System.out.println(nk.getpresident());
		System.out.println(nk.getdm());
		
		System.out.println("---------------------------------------");
		
		nk.setpm("anjmd2358jdjd");
		nk.sethm("hbjbfew461fbde");
		nk.setpresident("kfgkjsdv852895nfkjd");
		nk.setdm("bniwfwnin994bwnek");
		
		System.out.println(nk.getpm());
		System.out.println(nk.gethm());
		System.out.println(nk.getpresident());
		System.out.println(nk.getdm());
		
	}
}
