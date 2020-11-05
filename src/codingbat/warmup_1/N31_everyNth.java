package codingbat.warmup_1;

public class N31_everyNth {

	public static String everyNth(String str, int n) {
		String res = "";
		
		for (int i = 0; i < str.length(); i+=n) {
			res = res + str.charAt(i);
		}
		return res;
	}
	
	public static void main(String[] args) {
		System.out.println(everyNth("Miracle", 2));	
		System.out.println(everyNth("abcdefg", 2));	
		System.out.println(everyNth("abcdefg", 3));	
		System.out.println(everyNth("Chocolate", 3));	
		System.out.println(everyNth("Chocolates", 3));	
		System.out.println(everyNth("Chocolates", 4));	
		System.out.println(everyNth("Chocolates", 100));
	}
}
