package chap14.lecture.parameter;

public class ParameterEx2 {
	public static void main(String[] args) {
		MyInterface2 o1 = (int a, int b) -> System.out.println(a + b);
		o1.method(3, 10);
		
		MyInterface2 o2 = (x, y) -> System.out.println(x + y); // 파라미터 타입은 생략 가능
		o2.method(15, 5);
		
//		MyInterface2 o3 = a, b -> System.out.println(a + b); 파라미터 두개이상 일 때 ()괄호 생략 불가
	}
}
