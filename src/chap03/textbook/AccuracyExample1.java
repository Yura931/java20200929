package chap03.textbook;

public class AccuracyExample1 {
	public static void main(String[] args) {
		int apple =1 ;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number*pieceUnit;
		
		System.out.println("사과 한개에서");
		System.out.println("0.7 조각을 빼면, ");
		System.out.println(result + "조각이 남는다.");
		
		// 이진 포맷의 가수를 사용하는 부동소수점 타입 (float, double) 은 0.1을 정확히 표현할 수 없어 근사치로 처리
		// 정확 한 계산이 필요하다면 정수연산으로 변경해서 계산
	}
}
