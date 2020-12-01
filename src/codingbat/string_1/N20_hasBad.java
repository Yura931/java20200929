package codingbat.string_1;

public class N20_hasBad {
	public static boolean hasBad(String str) {
		int idx = str.indexOf("bad");
		// str.indexOf(""); 문자열이 맨 처음 발견되는 인덱스 번호를 알려줌
		return idx == 0 || idx == 1;
	}
	
	public static void main(String[] args) {
		System.out.println(hasBad("badxx"));	
		System.out.println(hasBad("xbadxx"));	
		System.out.println(hasBad("xxbadxx"));	
		System.out.println(hasBad("code"));	
		System.out.println(hasBad("bad"));	
		System.out.println(hasBad("ba"));	
		System.out.println(hasBad("xba"));	
		System.out.println(hasBad("xbad"));	
		System.out.println(hasBad(""));	
		System.out.println(hasBad("badyy"));
	}
}
