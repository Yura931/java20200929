package chap07.lecture.override;

public class ChildClass extends ParentClass {
	void method2() {
		System.out.println("child method");
	}
	
	// 컴파일 힌트 제공
	@Override 
	void method1() { // 상위클래스를 덮어쓰는 메소드 이다.
		System.out.println("child method1!!!!!!!");
	}
	
}
