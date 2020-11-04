package codingbat.warmup_1;

public class N15_front22 {

	public static String front22(String str) {
		int len = str.length();
		
		if (len <= 2) {
			return str + str + str;
		} else {
			String f = str.substring(0,2);
			return f + str + f;
		}
				
	}
	
	public static void main(String[] args) {
		System.out.println(front22("kitten"));	
		System.out.println(front22("Ha"));	
		System.out.println(front22("abc"));	
		System.out.println(front22("ab"));	
		System.out.println(front22("a"));	
		System.out.println(front22(""));	
		System.out.println(front22("Logic"));
	}
}
