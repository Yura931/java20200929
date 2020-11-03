package codingbat.warmup_1;

public class N10_missingChar {
	public static String missingChar(String str, int n) {
		String f = str.substring(0,n);
		String b = str.substring(n+1, str.length());
		
		return f + b;
	}
	public static void main(String[] args) {
		System.out.println(missingChar("kitten", 1));	
		System.out.println(missingChar("kitten", 0));	
		System.out.println(missingChar("kitten", 4));	
		System.out.println(missingChar("Hi", 0));	
		System.out.println(missingChar("Hi", 1));	
		System.out.println(missingChar("code", 0));	
		System.out.println(missingChar("code", 1));
		System.out.println(missingChar("code", 2));	
		System.out.println(missingChar("code", 3));	
		System.out.println(missingChar("chocolate", 8));
	}
}
