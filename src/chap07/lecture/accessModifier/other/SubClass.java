package chap07.lecture.accessModifier.other;

import chap07.lecture.accessModifier.MyClass; // 다른패키지 사용, import 해주어야 한다.

public class SubClass extends MyClass{ 
	void method1() {
		System.out.println(publicVar);
		System.out.println(protectedVar);
//		System.out.println(defaultVar);
	}
}
