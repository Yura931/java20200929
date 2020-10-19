package chap09.lecture.nestedClass;

public class MyApp {
	public static void main(String[] args) {
		MyClass.Class2 o1 = new MyClass.Class2();
		
		
		MyClass c1 = new MyClass();
		MyClass.Class1 o2 = c1.new Class1();  // instance 내부 크래스
		
	}
}
