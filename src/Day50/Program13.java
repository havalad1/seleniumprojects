package Day50;

public class Program13 {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("hello");
		System.out.println(sb);
		
		sb.append("world");
		System.out.println(sb);
		
		sb.append("testing");
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		
		StringBuffer s1=new StringBuffer("A");
		System.out.println(s1.toString());
		System.out.println(s1.hashCode());
		
		StringBuffer s2=new StringBuffer("A");
		System.out.println(s2.toString());
		System.out.println(s2.hashCode());
		
		System.out.println(s1==s2);
	}

}
