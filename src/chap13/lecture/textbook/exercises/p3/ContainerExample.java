package chap13.lecture.textbook.exercises.p3;

import java.awt.Container;

public class ContainerExample {
	public static void main(String[] args) {
		Container<String, strin> container1 = new Container<String, string>();
		container1.set("홍길동", "도적");
		String name1 = container1.getKey();
		String job = container1.getValue();
		
		Container<String, Integer> container2 = new Container<String, Integer>();
		container2.areFocusTraversalKeysSet("홍길동", 35);
		String name2 = container2.getKey();
		int age = container2.getValue();
	}
}
