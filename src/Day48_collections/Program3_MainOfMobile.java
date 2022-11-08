package Day48_collections;

import java.util.LinkedList;

import java.util.Iterator;

public class Program3_MainOfMobile 
{
	public static void main(String[] args) 
	{
		LinkedList al=new LinkedList();
		
		al.add(new Mobile("apple",4,23142.980));
		al.add(new Laptop("ios",2,512));
		al.add(new SmartWatch("boat",12,false));
		
		al.add(new Mobile("apple",4,23142.980));
		al.add(new Laptop("ios",2,512));
		al.add(new SmartWatch("boat",12,false));
		
		Iterator ref= al.iterator();
		
		while(ref.hasNext())
		{
			Object ob=ref.next();
			System.out.println(ob);
		//System.out.println(ref.next());
		}
		System.out.println("-------------retrieve using for each loop---------------");
		
		for(Object ob:al)
		{
			System.out.println(ob);
		}
	}
}

