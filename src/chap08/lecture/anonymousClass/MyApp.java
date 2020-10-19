package chap08.lecture.anonymousClass;

public class MyApp {
	public static void main(String[] args) {
		MyInterface o1 = new MyClass();
		o1.method1();
		
		MyInterface o2 = new MyInterface() { //instance 생성과 class생성을 한번에
			@Override
			public void method1() {
				System.out.println("anonymous class method1");
				
			}
		};
		
		o2.method1();
	}
	
}
