package chap02.type;

public class CharType {

	public static void main(String[] args) {
		// char : 2byte
		// 작은 따옴표를 이용해 하나의 문자를 표현
		
		char charValue;
		charValue = 'a';
		System.out.println(charValue);
		
//		charValue = 'ab';
//		charValue = ''; 하나의 문자를 꼭 가져야 함 빈 문자 x
		charValue = ' '; //space도 하나의 문자
		
		charValue = 44032;
		System.out.println(charValue);
		
		charValue = '나';
		System.out.println(charValue);
		
		charValue = '\uac00'; // '\'u16진법 코드
		System.out.println(charValue);
		
	}
}
