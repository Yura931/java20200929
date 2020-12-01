package codingbat.string_1;

public class N14_withouEnd2 {
	public static String withouEnd2(String str) {
		int len = str.length();
		if(len > 2) {
		String strm = str.substring(1,str.length()-1);
		return strm;
		} else {
			return "";
		}
	}
	
	public static void main(String[] args) {
		System.out.println(withouEnd2("Hello"));	
		System.out.println(withouEnd2("abc"));	
		System.out.println(withouEnd2("ab"));	
		System.out.println(withouEnd2("a"));	
		System.out.println(withouEnd2(""));	
		System.out.println(withouEnd2("coldy"));	
		System.out.println(withouEnd2("java code"));
	}
}
