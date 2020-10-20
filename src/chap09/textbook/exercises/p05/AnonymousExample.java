package chap09.textbook.exercises.p05;

public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.field.run();
		anony.method1();
		anony.method2(new Vehicle() { // 익명 클래스의 객체
			@Override
			public void run() {
				System.out.println("트럭이 달립니다.");
			}
		}		
	 );
   }
}
