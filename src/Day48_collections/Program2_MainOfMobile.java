package Day48_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Program2_MainOfMobile 
{
	public static void main(String[] args) 
	{
		//ArrayList al=new ArrayList();
		
		LinkedList al=new LinkedList();
		
		al.add(new Mobile("apple",4,23142.980));
		al.add(new Laptop("ios",2,512));
		al.add(new SmartWatch("boat",12,false));
		
		al.add(new Mobile("apple",4,23142.980));
		al.add(new Laptop("ios",2,512));
		al.add(new SmartWatch("boat",12,false));
		
		al.add(new Mobile("apple",4,23142.980));
		al.add(new Laptop("ios",2,512));
		al.add(new SmartWatch("boat",12,false));
		
		al.add("10 objects");
		al.add("11th object");
		al.add("java");
		al.add("java");
		al.add(null);
		al.add(5,null);
		System.out.println(al.size());
		
		for (int i = 0; i <al.size(); i++) 
		{
			Object ob=al.get(i);
			System.out.println(ob);
		}
		
		//ArrayList al2=new ArrayList(450);
		//System.out.println("----------------------");
		
		//ArrayList al3=new ArrayList(al);
		//System.out.println(al3.size());
		//for (int i = 0; i < al.size(); i++) 
		//{
			//Object ob=al3.get(i);
			//System.out.println(ob);
		//}
	}
}
