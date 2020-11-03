package codingbat.warmup_1;

public class N11_frontBack {
	public static String frontBack(String str) {
		int len = str.length();
		
		if(len >= 2) {
			String f = str.substring(0,1);
			String m = str.substring(1,len-1);
			String b = str.substring(len-1, len);
			
			return b + m + f; 			
		}
		return str;
	}
	
	public static void main(String[] args) {		
		System.out.println(frontBack("code"));	
		System.out.println(frontBack("a"));	
		System.out.println(frontBack("ab"));
		System.out.println(frontBack("abc"));	
		System.out.println(frontBack(""));	
		System.out.println(frontBack("Chocolate"));	
		System.out.println(frontBack("aavJ"));	
		System.out.println(frontBack("hello"));
	}
}
