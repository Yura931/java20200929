package codingbat.warmup_1;

public class N13_backAround {
	public static String backAround(String str) {
		int len = str.length();
		String back = str.substring(len-1);
		
		return back + str + back;
	}
	
	public static void main(String[] args) {
		System.out.println(backAround("cat"));	
		System.out.println(backAround("Hello"));	
		System.out.println(backAround("a"));	
		System.out.println(backAround("abc"));	
		System.out.println(backAround("read"));	
		System.out.println(backAround("boo"));
	}
}
