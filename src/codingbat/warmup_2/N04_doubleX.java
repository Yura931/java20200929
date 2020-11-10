package codingbat.warmup_2;

public class N04_doubleX {

	public static boolean doubleX(String str) {
		int len = str.length();
		
		for (int i = 0; i < len-1; i++) {
			if (len >= 3) {
				String sub1 = str.substring(0,2);
				String sub2 = str.substring(1,3);
				if (sub1.equals("xx") || sub2.equals("xx")) {
					return true;
				}
			}
			if (len < 3) {
				String sub3 = str.substring(0,2);
				if (sub3.equals("xx")) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(doubleX("axxbb")); 
		System.out.println(doubleX("axaxax"));
		System.out.println(doubleX("xxxxx")); 
		System.out.println(doubleX("xaxxx")); 
		System.out.println(doubleX("aaaax")); 
		System.out.println(doubleX(""));
		System.out.println(doubleX("abc"));
		System.out.println(doubleX("x"));
		System.out.println(doubleX("xx")); 
		System.out.println(doubleX("xax"));
		System.out.println(doubleX("xaxx"));
	}
}
