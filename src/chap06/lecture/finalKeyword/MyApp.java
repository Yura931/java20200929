package chap06.lecture.finalKeyword;

public class MyApp {
	public static void main(String[] args) {
		int i;
		final int j; // 값을 한번만 할당 받을 수 있는 기회
		
		
		
		i = 30;
		i = 40;
		
		j = 20;
//		j = 10;
		
		MyClass o1 = new MyClass();
		o1.field1 = 3;
//		o1.field2 = 4;
	}	
}
