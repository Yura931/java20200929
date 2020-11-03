package codingbat.warmup_1;

public class N12_front3 {
	public static String front3(String str) {
		int len = str.length();
		
		if (len >= 3) {
			String f3 = str.substring(0,3);
			return f3 + f3 + f3;
		}
		return str + str + str;
	}
	public static void main(String[] args) {
		System.out.println(front3("Java"));	
		System.out.println(front3("Chocolate"));	
		System.out.println(front3("abc"));	
		System.out.println(front3("abcXYZ"));	
		System.out.println(front3("ab"));	
		System.out.println(front3("a"));	
		System.out.println(front3(""));
	}
}
