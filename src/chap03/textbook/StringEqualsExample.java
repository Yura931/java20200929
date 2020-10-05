package chap03.textbook;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = "신민철"; // strVar1, 2 리터럴 값을 사용 같은 참조값을 갖게 됨
		String strVar2 = "신민철";
		String strVar3 = new String("신민철");
		
		System.out.println( strVar1 == strVar2 );
		System.out.println( strVar1 == strVar3 );
		System.out.println();
		// 실제 String 값을 알고 싶을 때 .equals method 사용
		System.out.println( strVar1.equals(strVar2 ));
		System.out.println( strVar1.equals(strVar3 ));
	}
}
