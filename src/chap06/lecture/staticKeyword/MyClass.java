package chap06.lecture.staticKeyword;

public class MyClass {
	static int var2; // Class field , static field , 
	int var1; // instance 멤버
	
	static { 
		System.out.println("static block");
		var2 = 3000; //static 필드를 초기화
	}
	
	void method1() {
		// instance 멤버
		method2();
		
		System.out.println(var2); // instance멤버에서 class멤버 접근 가능
		System.out.println(var1);
	}
	
	static void method2() { //class가 가지고 있는 기능
		System.out.println(var2);
		
		// Class field method
		// instance field method
		
//	static void method2() { //static멤버에서 instance멤버 접근 불가
//		System.out.println(var1);
//		System.out.println(var2);
	
	}
}
