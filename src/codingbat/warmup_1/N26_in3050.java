package codingbat.warmup_1;

public class N26_in3050 {
	
	public static boolean in3050(int a, int b) {
		 boolean in30 = (a >= 30 && a <= 40 && b >= 30 && b <= 40);
		  boolean in50 = (a >= 40 && a <= 50 && b >= 40 && b <= 50);
		  
		  if (in30 || in50) {
		    return true;
		  }
		  return false;
	}
	
	public static void main(String[] args) {
		System.out.println(in3050(30, 31));	
		System.out.println(in3050(30, 41));	
		System.out.println(in3050(40, 50));	
		System.out.println(in3050(40, 51));	
		System.out.println(in3050(39, 50));	
		System.out.println(in3050(50, 39));	
		System.out.println(in3050(40, 39));	
		System.out.println(in3050(49, 48));	
		System.out.println(in3050(50, 40));	
		System.out.println(in3050(50, 51));	
		System.out.println(in3050(35, 36));	
		System.out.println(in3050(35, 45));
	}
}
