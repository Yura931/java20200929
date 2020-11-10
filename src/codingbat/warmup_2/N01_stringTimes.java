package codingbat.warmup_2;

public class N01_stringTimes {
	
	public static String stringTimes(String str, int n) {
		String res = "";
		
		for (int i = 0; i < n; i++) {
			res += str;
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		System.out.println(stringTimes("Hi", 2));	
		System.out.println(stringTimes("Hi", 3));	
		System.out.println(stringTimes("Hi", 1)); 
		System.out.println(stringTimes("Hi", 0)); 
		System.out.println(stringTimes("Hi", 5)); 
		System.out.println(stringTimes("Oh Boy!", 2)); 
		System.out.println(stringTimes("x", 4)); 
		System.out.println(stringTimes("", 4)); 
		System.out.println(stringTimes("code", 2)); 
		System.out.println(stringTimes("code", 3)); 
	}
}
