package chap07.textbook.s070701;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child; // 자동 타입 변환
		parent.method1();
		parent.method2();
		//parent.method3(); //child = parent가 되지만 parent = child가 될 수 없다.
	}
}
