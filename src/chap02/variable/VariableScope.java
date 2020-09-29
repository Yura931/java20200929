package chap02.variable;

public class VariableScope {
	public static void main(String[] args) {
		// 변수의 사용 범위
		
		int a = 3;
		
		if (true) {
			int b = 5; //변수가 선언 된 코드블럭 {} 안에서만 사용 가능
			System.out.println(a);
			System.out.println(b);
			
		}
		
		System.out.println(a);
//		System.out.println(b);
	}
}
