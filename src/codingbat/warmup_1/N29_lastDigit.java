package codingbat.warmup_1;

public class N29_lastDigit {

	public static boolean lastDigit(int a, int b) {
		int la = a % 10;
		int lb = b % 10;
		
		if (la == lb) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(lastDigit(7, 17));	
		System.out.println(lastDigit(6, 17));	
		System.out.println(lastDigit(3, 113));	
		System.out.println(lastDigit(114, 113));	
		System.out.println(lastDigit(114, 4));	
		System.out.println(lastDigit(10, 0));	
		System.out.println(lastDigit(11, 0));
	}
}
