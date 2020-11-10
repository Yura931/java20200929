package codingbat.warmup_2;

public class N03_countXX {

	public static int countXX(String str) {
		int len = str.length();
		int cnt = 0;
		
		for (int i = 0; i < len-1; i++) {
			String x = str.substring(i,i+2);
			if (x.equals("xx")) {
				cnt++;
			}
		}
		return cnt;
	}
	
	public static void main(String[] args) {
		System.out.println(countXX("abcxx")); 
		System.out.println(countXX("xxx")); 
		System.out.println(countXX("xxxx"));
		System.out.println(countXX("abc")); 
		System.out.println(countXX("Hello there")); 
		System.out.println(countXX("Hexxo thxxe")); 
		System.out.println(countXX(""));	
		System.out.println(countXX("Kittens")); 
		System.out.println(countXX("Kittensxxx"));
	}
}
