package chap03.ternary;

public class TernaryOperator {
	public static void main(String[] args) {
		// 1항 ? 2항 : 3항
		// a ? b : c
		// 위 연산의 결과는 b 또는 c  a가 true면 b , false면 c -> a에 의해 결정됨 
		boolean a = true;
		int b = 3;
		int c = 5;
		
		System.out.println(a ? b : c);
	}
}
