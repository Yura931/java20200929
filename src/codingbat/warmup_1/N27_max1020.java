package codingbat.warmup_1;

public class N27_max1020 {
	
	public static int max1020(int a, int b) {
		boolean a10 = a >= 10 && a <= 20;
		boolean b10 = b >= 10 && b <= 20;
		
		if (a10 && b10) {
			if (a > b) {
				return a;
			} else if (a < b) {
				return b;
			}
		}
		if (a10 && !b10) {
			return a;
		} else if (!a10 && b10) {
			return b;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		System.out.println(max1020(11, 19));	
		System.out.println(max1020(19, 11));	
		System.out.println(max1020(11, 9));	
		System.out.println(max1020(9, 21));	
		System.out.println(max1020(10, 21));	
		System.out.println(max1020(21, 10));	
		System.out.println(max1020(9, 11));	
		System.out.println(max1020(23, 10));	
		System.out.println(max1020(20, 10));	
		System.out.println(max1020(7, 20));	
		System.out.println(max1020(17, 16));
	}
}
