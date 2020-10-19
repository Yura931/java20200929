package chap09.lecture.anonymous;

public class MyApp {
	public static void main(String[] args) {
		Parent p1 = new Child();
		p1.method1();
		
		//class 생성과 instance정의를 한번에
		
		Parent p2 = new Parent() {
		@Override
			public void method1() {
				System.out.println("anonymous method1");
			}	
		};
		p2.method1();
	
		Parent p3 = new Parent() { // 상속과 instance생성을 한번에 하기위해 추상클래스와 함께 사용
		
		};
	}
}
