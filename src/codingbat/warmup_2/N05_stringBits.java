package codingbat.warmup_2;

public class N05_stringBits {

	public static String stringBits(String str) {
		String res = "";
		int len = str.length();
		
		for (int i = 0; i < len; i += 2) {
			res += str.charAt(i);
		}
		return res;
	}
	
	public static void main(String[] args) {
		System.out.println(stringBits("Hello"));	
		System.out.println(stringBits("Hi")); 
		System.out.println(stringBits("Heeololeo")); 
		System.out.println(stringBits("HiHiHi"));
		System.out.println(stringBits("")); 
		System.out.println(stringBits("Greetings")); 
		System.out.println(stringBits("Chocoate")); 
		System.out.println(stringBits("pi")); 
		System.out.println(stringBits("Hello Kitten")); 	
		System.out.println(stringBits("hxaxpxpxy"));
	}
}
