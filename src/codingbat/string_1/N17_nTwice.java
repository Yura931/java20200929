package codingbat.string_1;

public class N17_nTwice {
	public static String nTwice(String str, int n) {
		int len = str.length();
		
		String strf = str.substring(0,n);
		String stre = str.substring(len - n);
		
		return strf + stre;
	}
	public static void main(String[] args) {
		System.out.println(nTwice("Hello", 2));
		System.out.println(nTwice("Chocolate", 3)); 
		System.out.println(nTwice("Chocolate", 1)); 
		System.out.println(nTwice("Chocolate", 0));
		System.out.println(nTwice("Hello", 4));
		System.out.println(nTwice("Code", 4)); 	
		System.out.println(nTwice("Code", 2)); 
	}
}
