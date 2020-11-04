package codingbat.warmup_1;

public class N17_icyHot {
	public static boolean icyHot(int temp1, int temp2) {
		boolean t1 = temp1 < 0 && temp2 > 100;
		boolean t2 = temp2 < 0 && temp1 > 100;
		
		if (t1 || t2) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(icyHot(120, -1));
		System.out.println(icyHot(-1, 120));	
		System.out.println(icyHot(2, 120));	
		System.out.println(icyHot(-1, 100));	
		System.out.println(icyHot(-2, -2));	
		System.out.println(icyHot(120, 120));
	}
}
