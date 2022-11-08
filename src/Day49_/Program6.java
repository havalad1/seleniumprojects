package Day49_;

import java.util.Comparator;
import java.util.TreeSet;

class Products implements Comparable {
	String name;
	double price;
	int id;
	public Products(String name, double price, int id) {
		this.name = name;
		this.price = price;
		this.id = id;
	}

	public String toString() {
		return "Products [name=" + name + ", price=" + price + ", id=" + id + "]";
	}
	
	public int compareTo(Object o) {
		Products pt=(Products)o;
		//return this.id-pt.id;
		//return (int) (this.price-pt.price);
		
		String first=this.name;
		String second=pt.name;
		int value=first.compareTo(second);
		return value;
	}
}

class SortOnId implements Comparator {
	public int compare(Object o1, Object o2) {
		Products pt1=(Products)o1;
		Products pt2=(Products)o2;
		return pt1.id-pt2.id;
	}	
}

class SortOnPrice implements Comparator {
	public int compare(Object o1, Object o2) {
		Products pt1=(Products)o1;
		Products pt2=(Products)o2;
		return (int)(pt1.price-pt2.price);
	}	
}

public class Program6 {
	public static void main(String[] args) {
		Products p1=new Products("tea", 350, 23);
		Products p2=new Products("maggie", 23.456, 345342);
		Products p3=new Products("tshirt", 675.123, 234);
		Products p4=new Products("belt", 500.12, 45);
		Products p5=new Products("watch",250.56, 123);
		
		TreeSet ts=new TreeSet();
		ts.add(p1);
		ts.add(p2);
		ts.add(p3);
		ts.add(p4);
		ts.add(p5);
		
		System.out.println(ts.size());
		for (Object ob : ts) {
			System.out.println(ob);
		}
			
			TreeSet ts2=new TreeSet(new SortOnId());
			ts2.add(p1);
			ts2.add(p2);
			ts2.add(p3);
			ts2.add(p4);
			ts2.add(p5);
			
			System.out.println(ts.size());
			for (Object ob2 : ts2) {
				System.out.println(ob2);	
			}
			
			TreeSet ts3=new TreeSet(new SortOnPrice());
			ts3.add(p1);
			ts3.add(p2);
			ts3.add(p3);
			ts3.add(p4);
			ts3.add(p5);
			
			System.out.println(ts3.size());
			for (Object ob3 : ts3) {
				System.out.println(ob3);	
			}
		}
	}

		

