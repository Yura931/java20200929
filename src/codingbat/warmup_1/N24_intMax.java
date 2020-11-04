package codingbat.warmup_1;

public class N24_intMax {

	public static int intMax(int a, int b, int c) {
		int max; 
		
		if (a > b) {
			max = a;
		} else {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		return max;
	}
	
	public static void main(String[] args) {
		System.out.println(intMax(1, 2, 3));	
		System.out.println(intMax(1, 3, 2));	
		System.out.println(intMax(3, 2, 1));	
		System.out.println(intMax(9, 3, 3));	
		System.out.println(intMax(3, 9, 3));
		System.out.println(intMax(3, 3, 9));
		System.out.println(intMax(8, 2, 3));	
		System.out.println(intMax(-3, -1, -2));
		System.out.println(intMax(6, 2, 5));
		System.out.println(intMax(5, 6, 2));
		System.out.println(intMax(5, 2, 6));
	}             
}
