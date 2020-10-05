package chap03.binary;

public class CompareOperator {
	public static void main(String[] args) {
		// 비교연산자
		// == != < <= > >= 
		// 결과 boolean
		// java는 type을 비교한는 연산자 없음
		
		int a = 3;
		int b = 5;
		
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a < b);
		System.out.println(a <= b);
		System.out.println(a > b);
		System.out.println(a >= b);
		
		// 양 변이 같은타입인지 확인 후 비교
		
		double c = 3.0;
		System.out.println(a == c); // 다른 타입일 경우 큰 타입으로 변환 후 비교
		
		float d = 0.1F;
		double e = 0.1;
		System.out.println(d == e);
	}
}
