package chap06.lecture.accessModifier.other;

import chap06.lecture.accessModifier.MyClass;

public class MyApp {
	public static void main(String[] args) {
		MyClass o1 = new MyClass();
		
		System.out.println(o1.var1);
//		System.out.println(o1.var2);  다른패키지 내에서는 사용 불가능
//		System.out.println(o1.var3);
		
	}
}
