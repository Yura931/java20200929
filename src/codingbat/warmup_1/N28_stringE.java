package codingbat.warmup_1;

public class N28_stringE {

	public static boolean stringE(String str) {
		int cnt = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'e') cnt++;
		}
		return (cnt >= 1 && cnt <= 3);
	}
	
	public static void main(String[] args) {
		System.out.println(stringE("Hello"));	
		System.out.println(stringE("Heelle"));	
		System.out.println(stringE("Heelele"));	
		System.out.println(stringE("Hll"));	
		System.out.println(stringE("e"));	
		System.out.println(stringE(""));
	}
}
