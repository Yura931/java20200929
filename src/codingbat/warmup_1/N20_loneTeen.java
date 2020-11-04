package codingbat.warmup_1;

public class N20_loneTeen {
	
	public static boolean loneTeen(int a, int b) {
		boolean Ta = a >= 13 && a <= 19;
		boolean Tb = b >= 13 && b <= 19;
		
		if (Ta ^ Tb) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(loneTeen(13, 99));	
		System.out.println(loneTeen(21, 19));	
		System.out.println(loneTeen(13, 13));	
		System.out.println(loneTeen(14, 20));	
		System.out.println(loneTeen(20, 15));	
		System.out.println(loneTeen(16, 17));	
		System.out.println(loneTeen(16, 9));
		System.out.println(loneTeen(16, 18));	
		System.out.println(loneTeen(13, 19));	
		System.out.println(loneTeen(13, 20));
		System.out.println(loneTeen(6, 18));
		System.out.println(loneTeen(99, 13));
		System.out.println(loneTeen(99, 99));
	}
}
