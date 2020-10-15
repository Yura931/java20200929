package chap07.lecture.superConstructor;

public class ChildClass extends ParentClass{
	public ChildClass() {// args가 없는 생성자
//		super();
		super(1); // args 생성자를 자동으로 호출하고 있었음.
	}			// 상위클래스에 args있는 생성자를 작성하면 자동으로 부모생성자 클래스 호출이 불가능, 때문에 args있는 생성자를 명시 해주어야 한다.
				
	@Override
	void method1() {
		super.method1();
		System.out.println("child method1");
	}
}
