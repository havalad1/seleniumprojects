package Day50;

public class Program12 {
	public static void main(String[] args) {
		String s1="java";
		System.out.println(s1);
		String s2=s1;
		System.out.println(s1);
		
		s1="testing";
		System.out.println(s1);
		
		System.out.println(s2);
		
		
		String v1=new String();
		System.out.println(v1);
		
		String v2=new String("hello");
		System.out.println(v2);
		
		char [] ar= {'a','b','d','e'};
		String v3=new String(ar);
		System.out.println(v3);
		
		
		String r1="AB";
		System.out.println(r1.toString());
		System.out.println(r1.hashCode());
		
		String r2=new String("AB");
		System.out.println(r1.toString());
		System.out.println(r1.hashCode());
		
		System.out.println(r1==r2);
		System.out.println(r1.equals(r2));
	}
}
