package chap07.lecture.superKeyword;

public class ChildClass extends ParentClass{
	@Override // ctrl + space Override하고 싶은 method 선택
	void method1() { // 상위클래스에 접근하는 키워드 super
//		System.out.println("parent method1"); 
		super.method1();
		System.out.println("child method1");
	
	}
}
