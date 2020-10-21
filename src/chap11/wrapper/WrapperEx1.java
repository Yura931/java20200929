package chap11.wrapper;

public class WrapperEx1 {
	public static void main(String[] args) {
		// byte, short, int, long
		// float, double, char, boolean
		
		// Byte, Short, Integer, Long
		// Float, Double, Character, Boolean
		
		int i = 1;
		
		Integer in = Integer.valueOf(i); // 나중에 참조타입으로 사용하기 위해 Integer로 감싸줌 ,  기본타입을 참조타입으로 변환 시킬 때 사용하는 코드
		
		method1(in); // 기본타입 할당시 Object에 할당 불가 , 참조타입과 기본타입은 서로간의 값 할당 불가능
		
		int j = 2;
		method1(j);
		
		int l = in.intValue();
		int k = in;
		
		Integer in2 = 3;
		int m = in2; // 참조타입을 기본타입에 바로 할당 가능
	}
	
	public static void method1(Object o) {
		System.out.println(o);
	}
}
