package codingbat.warmup_1;

public class N16_startHi {
	public static boolean startHi(String str) {
		int len = str.length();
		
		if (len >= 2) {
			String h = str.substring(0,2);
			if (h.equals("hi")) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(startHi("hi there"));
		System.out.println(startHi("hi"));	
		System.out.println(startHi("hello hi"));	
		System.out.println(startHi("he"));	
		System.out.println(startHi("h"));	
		System.out.println(startHi(""));	
		System.out.println(startHi("ho hi"));	
		System.out.println(startHi("hi ho"));
	}
}
