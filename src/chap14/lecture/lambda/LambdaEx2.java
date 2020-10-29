package chap14.lecture.lambda;

public class LambdaEx2 {
	public static void main(String[] args) {
		MyInterface o1 = () -> {  // statement가 한줄이 아닐 경우 {} 중괄호 사용
			System.out.println("hello");
			System.out.println("world");
		};
		o1.method();
		
		o1 = () -> System.out.println("hi");
		o1.method();
		
		MyInterface o2 = () -> { System.out.println("java"); };
		MyInterface o3 = () -> System.out.println("jsp");
		
		o1.method();
		o2.method();
		o3.method();
	}
}
