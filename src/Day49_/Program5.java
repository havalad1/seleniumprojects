package Day49_;

import java.util.HashSet;

class CuurencyNote {
	String color;
	int value;
	int serial;
	public CuurencyNote(String color, int value, int serial) {
		this.color = color;
		this.value = value;
		this.serial = serial;
	}
	
	public String toString() {
		return "CuurencyNote [color=" + color + ", value=" + value + ", serial=" + serial + "]";
	}
	
	public int hashCode() {
		return serial;
	}
	
	public boolean equals(Object ob) {
		CuurencyNote ct=(CuurencyNote)ob;
		return this.serial==ct.serial;
	}
}

public class Program5 {
	public static void main(String[] args) {
		CuurencyNote c1=new CuurencyNote("pink", 2000, 12345);
		CuurencyNote c2=new CuurencyNote("pink", 2000, 12345);
		
		HashSet hs=new HashSet();
		hs.add(c1);
		hs.add(c2);
		
		
		System.out.println(hs.size());
		for (Object ob : hs) {
			System.out.println(ob);
		}
	}
}
