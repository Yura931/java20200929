package codingbat.warmup_1;

public class N19_hasTeen {
	public static boolean hasTeen(int a, int b, int c) {
		  boolean Teena = a >= 13 && a <= 19;
		  boolean Teenb = b >= 13 && b <= 19;
		  boolean Teenc = c >= 13 && c <= 19;
		  
		  if (Teena || Teenb || Teenc) {
		    return true;
		  }
		  return false;
		}
		
	public static void main(String[] args) {
		System.out.println(hasTeen(13, 20, 10));	
		System.out.println(hasTeen(20, 19, 10));	
		System.out.println(hasTeen(20, 10, 13));	
		System.out.println(hasTeen(1, 20, 12));	
		System.out.println(hasTeen(19, 20, 12));	
		System.out.println(hasTeen(12, 20, 19));	
		System.out.println(hasTeen(12, 9, 20));	
		System.out.println(hasTeen(12, 18, 20));	
		System.out.println(hasTeen(14, 2, 20));	
		System.out.println(hasTeen(4, 2, 20));	
		System.out.println(hasTeen(11, 22, 22));
	}
}
