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
		int value = (int)charValue;
//		System.out.println(charValue);
		System.out.println(value);
		// char 타입의 경우 int 타입으로 자동 변환되면 유니코드 값이 int 타입에 저장된다.
		
		charValue = '\uac00'; // '\'u16진법 코드
		System.out.println(charValue);
		
		// char의 범위는 0~65535이므로 음수가 저장될 수 없다.
		// 따라서 음수가 저장될 수 있는 byte타입을 char타입으로 자동 변환시킬 수 없다.
		
		byte byteValue = 65;
//		char charValue = byteValue;   //컴파일 에러
		char charData = (char) byteValue; //강제 타입 변환
		System.out.println(charData);
		
		
		
	}
}
