package chap03.binary;

public class ConcatOperator {
	public static void main(String[] args) {
		// 연결연산자 concatenate
		int a = 3;
		int b = 5;
		int c = a + b;
		
		String s = "9";
		String d = a + s; // String + int 혹은 double = String 
						// int타입 x ,String 타입에 담을 수 있음
		System.out.println(d);
		
		String e = a + b + s;
		System.out.println(e);
		
		String f = s + b + a;
		System.out.println(f);
		
		// + 연산자 사용시 양변 항이 String인지 잘 확인
	}
}
