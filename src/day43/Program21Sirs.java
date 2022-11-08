package day43;
interface UpiPayments
{
	void sendmoney();
	void receivemoney();
	void checkbalance();	
}

//object implementation layer
class GooglePay implements UpiPayments
{
public void sendmoney()
{
System.out.println("establish gateway for payment through googlepay");	
System.out.println("send money to receiver through googlepay");
System.out.println("cashback offers");
}
public void receivemoney()
{
	System.out.println("establish gateway for payment through googlepay for receving money");	
	System.out.println("receive money from the sender");
	System.out.println("add money into bank account");
}
public void checkbalance()
{
System.out.println("display balance through googlepay");	
}
}

class PhonePe implements UpiPayments
{
public void sendmoney()
{
System.out.println("establish gateway for payment through PhonePe ");	
System.out.println("send money to receiver through PhonePe");
}
public void receivemoney()
{
	System.out.println("establish gateway for payment through PhonePe for receving money");	
	System.out.println("receive money from the sender");
	System.out.println("add money into bank account");
}
public void checkbalance()
{
System.out.println("display balance through PhonePe");	
}
}

//object creation layer
class PlayStore
{
	public UpiPayments download(char select)
	{
		if(select=='g')
		{
			return new GooglePay();
		}
		else
		{
			return new PhonePe();
		}
	}
}

//object utilization layer
public class Program21Sirs {
public static void main(String[] args) {
	PlayStore ref=new PlayStore();
	UpiPayments upi=ref.download('p');
	
	upi.sendmoney();
	upi.receivemoney();
	upi.checkbalance();
}
}
