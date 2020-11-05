package codingbat.warmup_1;

public class N25_close10 {

	public static int close10(int a, int b) {
		int a10 = Math.abs(10-a);
		int b10 = Math.abs(10-b);
		
		if (a10 > b10) {
			return b;
		} else if (a10 == b10) {
			return 0;
		} return a;
	}
	
	public static void main(String[] args) {
		System.out.println(close10(8, 13));	
		System.out.println(close10(13, 8));	
		System.out.println(close10(13, 7));	
		System.out.println(close10(7, 13));	
		System.out.println(close10(9, 13));	
		System.out.println(close10(13, 8));	
		System.out.println(close10(10, 12));	
		System.out.println(close10(11, 10));	
		System.out.println(close10(5, 21));	
		System.out.println(close10(0, 20));	
		System.out.println(close10(10, 10));	
	}
}
