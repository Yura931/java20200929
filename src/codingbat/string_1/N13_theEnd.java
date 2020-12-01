package codingbat.string_1;

public class N13_theEnd {
	public static String theEnd(String str, boolean front) {
		String strf = str.substring(0,1);
		String strl = str.substring(str.length()-1);
		
		if(front) {
			return strf;
		} else {
			return strl;
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println(theEnd("Hello", true)); 
		System.out.println(theEnd("Hello", false));
		System.out.println(theEnd("oh", true));
		System.out.println(theEnd("oh", false)); 
		System.out.println(theEnd("x", true)); 
		System.out.println(theEnd("x", false)); 
		System.out.println(theEnd("java", true));
		System.out.println(theEnd("chocolate", false)); 
		System.out.println(theEnd("1234", true)); 
		System.out.println(theEnd("code", false));
	}
}
