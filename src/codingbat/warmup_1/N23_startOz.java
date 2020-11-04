package codingbat.warmup_1;

public class N23_startOz {

	public static String startOz(String str) {
		String res = "";
		
		if (str.length() >= 1 && str.charAt(0)=='o') {
			res = res + str.charAt(0);
		}
		
		if (str.length() >= 2 && str.charAt(1)=='z') {
			res = res + str.charAt(1);
		}
		return res;
		
	}

	public static void main(String[] args) {
		System.out.println(startOz("ozymandias"));	
		System.out.println(startOz("bzoo"));	
		System.out.println(startOz("oxx"));	
		System.out.println(startOz("oz"));	
		System.out.println(startOz("ounce"));	
		System.out.println(startOz("o"));	
		System.out.println(startOz("abc"));	
		System.out.println(startOz(""));	
		System.out.println(startOz("zoo"));	
		System.out.println(startOz("aztec"));	
		System.out.println(startOz("zzzz"));	
		System.out.println(startOz("oznic"));	
	}
}
