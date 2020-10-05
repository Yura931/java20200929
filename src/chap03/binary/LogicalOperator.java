package chap03.binary;

public class LogicalOperator {
	public static void main(String[] args) {
		// 논리연산자
		// && & and : 양변이 true일 때만 true
		// || | or : 양변이 false일 떄만 false
		// ^ xor (exclusive or, 배타적논리합) : 다를 때만 true
		

		System.out.println(("==== and ===="));
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		
		System.out.println(("==== or ===="));
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		// 리터럴 or 변수 사용해도 같음 & ,| 하나쓰나 두개쓰나 결과는 같음

		System.out.println(("==== xor ===="));
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		

		System.out.println(("==== & | ===="));
		int a = 3;
		System.out.println(false & false);
		System.out.println(false & true);
		System.out.println((a < 0) & (a++ < 0));
		System.out.println(a);
	
		System.out.println("===== && || =====");
		System.out.println(false && false);
		System.out.println(false && true);
		System.out.println((a < 0) && (a++ < 0));
		System.out.println(a);
		
		// & = 앞의것이 false 여도 뒤에것도 판단 , && 앞의 것 false 일 시 뒤에 것 판단x short circuit
		// ||도 같은 맥락
		
	}
}
