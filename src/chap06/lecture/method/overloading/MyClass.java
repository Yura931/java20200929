package chap06.lecture.method.overloading;

public class MyClass {
	void method1() {
		System.out.println("method1......");
	}
	
	void method1(int i) { // 같은 이름의 method를 만들 때 parameter 타입, 값이 다르거나, 같은타입 다른갯수, 타입의 순서가 다른 경우여야 함.
		System.out.println("method1#######");
	}
	
	void method1(double j) {
		System.out.println("method1*******");
	}
	
	void method1(int i, int j) {
		System.out.println("method1 int, int");
	}
	
	void method(int i, double j) {
		System.out.println("method1 int, double");
	}
	
	void method1(double i, int j ) {
		System.out.println("method1 double, int");
	}
	
//	int method1(double i, int j) { //return타입으로 구분 되지 않는다
//		System.out.println("");
//	}	return 3; 이렇게는 사용 불가능
}
