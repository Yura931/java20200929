package codingbat.warmup_1;

public class N04_diff21 {

	public static int diff21(int n) {
		int diff = 21 - n;
		int res = 0;
		
		if (diff >= 0) {
			res = diff;
		} else {
			res = diff * -2;
		}
		return res;
	}
	
	public static void main(String[] args) {
		System.out.println(diff21(19));
		System.out.println(diff21(10));
		System.out.println(diff21(21));
		System.out.println(diff21(22));
		System.out.println(diff21(25));
		System.out.println(diff21(30));
		System.out.println(diff21(0));
		System.out.println(diff21(1));
		System.out.println(diff21(2));
		System.out.println(diff21(-1));
		System.out.println(diff21(-2));
		System.out.println(diff21(50));
	}
}
