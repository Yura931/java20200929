package codingbat.warmup_2;

public class N02_frontTimes {

	public static String frontTimes(String str, int n) {
		String res = "";
		int len = str.length();
		
		for (int i = 0; i < n; i++) {
			if (len >= 3) {
				String sub3 = str.substring(0,3);
				res += sub3;
			} else {
				res += str;
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		System.out.println(frontTimes("Chocolate", 2)); 
		System.out.println(frontTimes("Chocolate", 3)); 
		System.out.println(frontTimes("Abc", 3)); 
		System.out.println(frontTimes("Ab", 4));
		System.out.println(frontTimes("A", 4)); 
		System.out.println(frontTimes("", 4));
		System.out.println(frontTimes("Abc", 0));
	}
}
