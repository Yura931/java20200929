package codingbat.string_1;

public class N19_middleThree {
	public static String middleThree(String str) {
		int lenM = str.length() / 2;
		String mid = str.substring(lenM - 1, lenM + 2);
		
		return mid;		
	}
	
	public static void main(String[] args) {
		System.out.println(middleThree("Candy"));	
		System.out.println(middleThree("and"));	
		System.out.println(middleThree("solving"));	
		System.out.println(middleThree("Hi yet Hi"));	
		System.out.println(middleThree("java yet java"));	
		System.out.println(middleThree("Chocolate"));	
		System.out.println(middleThree("XabcxyzabcX"));
	}
}
