package Day49_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Program4 {

	public static void main(String[] args) {
		//HashSet hs=new HashSet<>();
		LinkedHashSet hs=new LinkedHashSet();
		hs.add("java");
		hs.add("J2ee");
		hs.add("testing");
		hs.add("Java");
		hs.add("web");
		hs.add("framework");
		hs.add("Java");
		hs.add("web");
		hs.add("framework");
		
		System.out.println(hs.size());
		
		Iterator ref=hs.iterator();
		while(ref.hasNext()) {
			Object ob=ref.next();
			System.out.println(ob);
		}
	}
}
