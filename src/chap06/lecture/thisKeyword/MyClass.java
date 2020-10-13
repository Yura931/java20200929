package chap06.lecture.thisKeyword;

public class MyClass {
	int var; //instance field
	
	MyClass() {
		
	}
	
	MyClass(int var) {
		this.var = var;
	}
	
	void method1() {	//instance method라 부른다 ..
		int var = 5;
		System.out.println(this.var);
		System.out.println(var);
	}
	
	void method2() {
		this.method1();
	}
}
