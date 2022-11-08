package Day44;

class Demo1
{
	
}

class Demo2
{
	public int hashCode()
	{
		return 23;
	}
	public String toString()
	{
		return "hi how are you";
	}
}

public class Program1_hashCodeMethod {
	public static void main(String[] args) 
	{
		Demo1 d1=new Demo1();
		System.out.println(d1.hashCode());
		System.out.println(d1.toString());
		System.out.println("d1="+d1);
		
		Demo2 d2=new Demo2();
		System.out.println(d2.hashCode());
		System.out.println(d2.toString());
		System.out.println("d2="+d2);
	}
}
//it is impossible to know the address of the method
//if forceably print address then it will internally call toString()
//and displays the value of toString()