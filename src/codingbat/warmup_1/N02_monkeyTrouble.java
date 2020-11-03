package codingbat.warmup_1;

public class N02_monkeyTrouble {
	public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		return (aSmile && bSmile) || (!aSmile && ! bSmile);
	}
	
	public static void main(String[] args) {
		System.out.println(monkeyTrouble(true,true));
		System.out.println(monkeyTrouble(false,false));
		System.out.println(monkeyTrouble(true,false));
		System.out.println(monkeyTrouble(false,true));
	}
}
