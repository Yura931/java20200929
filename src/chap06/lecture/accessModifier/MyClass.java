package chap06.lecture.accessModifier;

public class MyClass {
	// 접근제한자
	// public, protected, (default/package private), private
	
	// public: 모든 외부 클래스에서 사용 가능 가장 넓은범위
	// (default): 같은 패키지 내의 외부 클래스에서 사용 가능
	// private: 클래스 내에서만 사용가능 가장 좁은범위
	
	public int var1;
	int var2;
	private int var3;
	
	void method1() { //Class내에서 다 사용 가능
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
	}
}
