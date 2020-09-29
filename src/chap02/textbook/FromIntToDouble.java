package chap02.textbook;

public class FromIntToDouble {

	public static void main(String[] args) {
		
		int num1 = 123456780;
		int num2 = 123456780;
		
		double num3 = num2;
		num2 = (int) num3;
		
		// double type은 52bit의 정수 저장 가능
		int result = num1 - num2;
		System.out.println(result);
		// 실수와 정수 저장시에 값 손실이 일어날 수 있다.
	}
}
