package chap05.textbook;

public class ArrayReferenceObjectExample {
	public static void main(String[] args) {
		String[] strArray = new String[3]; // 배열 초기값을 정해놓지 않은 상태이기 때문에 null 상태
		strArray[0] = "Java"; // "Java" 라는 String을 가진 instance 생성 
		strArray[1] = "Java"; // leteral한 값을 쓰게되면 이전 leteral값을 사용
		strArray[2] = new String("Java"); 
		
		System.out.println( strArray[0] == strArray[1] );
		System.out.println( strArray[0] == strArray[2] ); // strArray[2]는 새로운 instance값을 생성했기 때문에 [0]과 참조값이 같지 않다.
		System.out.println( strArray[0].contentEquals(strArray[2]));
	}
}
