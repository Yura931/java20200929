package codingbat.warmup_1;

public class N14_or35 {

	public static boolean or35(int n) {
		boolean n3 = n % 3 == 0;
		boolean n5 = n % 5 == 0;
		
		if (n3 || n5) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(or35(3));
		System.out.println(or35(10));	
		System.out.println(or35(8));	
		System.out.println(or35(15));	
		System.out.println(or35(5));	
		System.out.println(or35(9));	
		System.out.println(or35(4));
		System.out.println(or35(45));	
		System.out.println(or35(99));	
		System.out.println(or35(100));	
		System.out.println(or35(101));	
		System.out.println(or35(121));	
		System.out.println(or35(122));	
		System.out.println(or35(123));
	}
}
