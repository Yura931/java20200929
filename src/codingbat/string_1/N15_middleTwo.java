package codingbat.string_1;

public class N15_middleTwo {
	public static String middleTwo(String str) {
		// 가운데 두 글자
		int len = str.length();
		String strm = str.substring(len/2 - 1, len/2 + 1);
		return strm;
	}
	
	public static void main(String[] args) {
		System.out.println(middleTwo("string"));	
		System.out.println(middleTwo("code"));	
		System.out.println(middleTwo("Practice"));	
		System.out.println(middleTwo("ab"));	
		System.out.println(middleTwo("0123456789"));
	}
}
