package codingbat.warmup_1;

public class N09_notString {
	
	public static String notString(String str) {
		String not = "not";
		int len = str.length();
		
		if (len >= 3) {
			String front = str.substring(0,3);
			if(front.equals(not)) {
				return str;
			}
		}
		return not +" "+ str;
	}
	
	public static void main(String[] args) {
		System.out.println(notString("candy"));	
		System.out.println(notString("x"));	
		System.out.println(notString("not bad"));	
		System.out.println(notString("bad"));	
		System.out.println(notString("not"));
		System.out.println(notString("is not"));	
		System.out.println(notString("no"));
	}
}
