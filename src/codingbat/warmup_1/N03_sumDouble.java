package codingbat.warmup_1;

public class N03_sumDouble {
	public static int sumDouble(int a, int b) {
		 int sum = 0;
		 
		 if (a != b) {
			 sum = a + b;
		 }
		 if (a == b) {
			 sum = (a + b) * 2;
		 }
		 return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(sumDouble(1,2));
		System.out.println(sumDouble(3,2));
		System.out.println(sumDouble(2,2));
		System.out.println(sumDouble(-1,0));
		System.out.println(sumDouble(3,3));
		System.out.println(sumDouble(0,0));
		System.out.println(sumDouble(0,1));
		System.out.println(sumDouble(3,4));
	}
}
