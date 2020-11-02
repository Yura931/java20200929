package codingbat.warmup_1;

public class ParrotTrouble {
	public static boolean parrotTrouble(boolean talking, int hour) {
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(parrotTrouble(true, 6));
		System.out.println(parrotTrouble(true, 7));
		System.out.println(parrotTrouble(false, 6));
		System.out.println(parrotTrouble(true, 21));
		System.out.println(parrotTrouble(false, 21));
		System.out.println(parrotTrouble(false, 20));
		System.out.println(parrotTrouble(true, 23));
		System.out.println(parrotTrouble(false, 23));
		System.out.println(parrotTrouble(true, 20));
		System.out.println(parrotTrouble(false, 12));
	}
}
