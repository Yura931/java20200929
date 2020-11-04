package codingbat.warmup_1;

public class N18_in1020 {
	public static boolean in1020(int a, int b) {
		boolean ina = a >= 10 && a <= 20;
		boolean inb = b >= 10 && b <= 20;
		
		if (ina || inb) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(in1020(12, 99));	
		System.out.println(in1020(21, 12));	
		System.out.println(in1020(8, 99));	
		System.out.println(in1020(99, 10));	
		System.out.println(in1020(20, 20));	
		System.out.println(in1020(21, 21));	
		System.out.println(in1020(9, 9));
	}
}
