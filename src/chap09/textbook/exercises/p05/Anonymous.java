package chap09.textbook.exercises.p05;

public class Anonymous {
	
	Vehicle field = new Vehicle() {
	
	@Override
	public void run() {
		System.out.println("자전거가 달립니다.");
		}
	};
	
	void method1() {
		Vehicle localVar = new Vehicle() { // 클래스 정의를 instance 만들며 같이 만듬
			
			@Override
			public void run() {
				System.out.println("승용차가 달립니다.");
			}
		};
				
		localVar.run();
	}
	
	void method2(Vehicle v) {
		v.run();
	}
}