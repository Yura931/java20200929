package chap13.lecture;

public class MyClass<T> { // < T > 타입 파라미터 , 타입을 받는 파라미터
	public void method1() {
		System.out.println("메소드1");
	}
	
	 public void method2(T s) {
		 System.out.println(s);
	 }
}
