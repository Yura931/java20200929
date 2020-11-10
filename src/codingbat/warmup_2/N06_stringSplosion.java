package codingbat.warmup_2;

public class N06_stringSplosion {

	public static String stringSplosion(String str) {
		String res = "";
		int len = str.length();
		
		for (int i = 0; i < len; i++) {
			res += str.substring(0, i+1);
		}
		return res;
	}
	public static void main(String[] args) {
		System.out.println(stringSplosion("Code"));
		System.out.println(stringSplosion("abc")); 
		System.out.println(stringSplosion("ab")); 
		System.out.println(stringSplosion("x")); 
		System.out.println(stringSplosion("fade"));
		System.out.println(stringSplosion("There")); 
		System.out.println(stringSplosion("Kitten"));
		System.out.println(stringSplosion("Bye")); 
		System.out.println(stringSplosion("Good"));
		System.out.println(stringSplosion("Bad"));
	}
}
