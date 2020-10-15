package chap07.lecture.superConstructor;

public class MyApp {
	public static void main(String[] args) {
		ChildClass o1 = new ChildClass(); // 자식클래스 인스턴스 만들 때 부모클래스 인스턴스도 만들어짐
		o1.method1();
	}
}
