package chap09.lecture.localClass;

public class MyApp {
	public static void main(String[] args) {
		int i = 3;
		System.out.println(i); // 메소드 안쪽에서 쓰이는 변수 = 로컬변수 ,지역변수 ; 메소드가 사라지면 변수도 함께 사라짐
		
		class LocalClass {
			int i;
//			static int j;
			
			void method() { }
//			static void method2() { }
		}
		
		LocalClass l1 = new LocalClass();
	}
}
