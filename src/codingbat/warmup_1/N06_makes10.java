package codingbat.warmup_1;

public class N06_makes10 {
	public static boolean makes10 (int a, int b) {
		boolean one = (a == 10 || b == 10);
		boolean sum = (a + b == 10);
		
		if (one || sum) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(makes10(9, 10));	
		System.out.println(makes10(9, 9));
		System.out.println(makes10(1, 9)); 	
		System.out.println(makes10(10, 1)); 	
		System.out.println(makes10(10, 10)); 	
		System.out.println(makes10(8, 2));
		System.out.println(makes10(8, 3));	
		System.out.println(makes10(10, 42)); 	
		System.out.println(makes10(12, -2));
	}
}
