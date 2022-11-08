package Day50;

public class Program9 {
	public static void main(String[] args) {
		String s1="development";
		System.out.println(s1.length());
		
		char ch=s1.charAt(3);
		System.out.println(ch);
		
		char []ar=s1.toCharArray();
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
		
		String out=s1.toUpperCase();
		System.out.println(out);
	}

}
