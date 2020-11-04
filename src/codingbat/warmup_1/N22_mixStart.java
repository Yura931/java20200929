package codingbat.warmup_1;

public class N22_mixStart {

	public static boolean mixStart(String str) {
		int len = str.length();
		
		if (len >= 3) {
			String ix = str.substring(1,3);
			if (ix.equals("ix")) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(mixStart("mix snacks"));	
		System.out.println(mixStart("pix snacks"));	
		System.out.println(mixStart("piz snacks"));
		System.out.println(mixStart("nix"));	
		System.out.println(mixStart("ni"));	
		System.out.println(mixStart("n"));	
		System.out.println(mixStart(""));
	}
}
