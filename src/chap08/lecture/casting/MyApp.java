package chap08.lecture.casting;

public class MyApp {
	public static void main(String[] args) {
		MyClass o1 = new MyClass();
		MyInterface i1 = o1; 
		i1.method1();
		
		MyClass o2 = (MyClass) i1; // 강제 형변환 , 캐스팅 연산
		o2.method2(); 
		
		System.out.println(i1 instanceof MyInterface); // i1 => MyClass , MyInterface => MyClass
		System.out.println(i1 instanceof MyClass);
	}
}
