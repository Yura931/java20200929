package codingbat.warmup_1;

public class N07_nearHundred {
	
	public static boolean nearHundred(int n) {
		boolean n100 = (90 <= n && 110 >= n);
		boolean n200 = (190 <= n && 210 >= n);
		
		if (n100 || n200) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println(nearHundred(93));	
		System.out.println(nearHundred(90));
		System.out.println(nearHundred(89));	
		System.out.println(nearHundred(110));	
		System.out.println(nearHundred(111));	
		System.out.println(nearHundred(121));	
		System.out.println(nearHundred(-101));	
		System.out.println(nearHundred(-209));	
		System.out.println(nearHundred(190));	
		System.out.println(nearHundred(209));	
		System.out.println(nearHundred(0));	
		System.out.println(nearHundred(5));	
		System.out.println(nearHundred(-50));	
		System.out.println(nearHundred(191));	
		System.out.println(nearHundred(189));	
		System.out.println(nearHundred(200));	
		System.out.println(nearHundred(210));	
		System.out.println(nearHundred(211));	
		System.out.println(nearHundred(290));
	}
}
