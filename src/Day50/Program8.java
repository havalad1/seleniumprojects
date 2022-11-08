package Day50;

import java.util.ArrayList;

import Day48_collections.Laptop;
import Day48_collections.Mobile;
import Day48_collections.SmartWatch;

public class Program8 {
	public static void main(String[] args) {
		ArrayList<Mobile> al=new ArrayList();
		al.add(new Mobile("apple",4,23142.980));
		al.add(new Laptop("ios",2,512));
		al.add(new SmartWatch("boat",12,false));
		al.add(new Mobile("apple",4,23142.980));
		al.add(new Laptop("ios",2,512));
		al.add(new SmartWatch("boat",12,false));
		
		for (Object ob : al) {
			System.out.println(ob);
		}
	}

}
