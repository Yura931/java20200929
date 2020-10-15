package chap07.lecture.finalKeyword;

public class ParentClass {
	final void method1() {  // 상속받은 클래스에서 메소드 재정의를 원하지 않음
		System.out.println("parent method1");
	}
}
