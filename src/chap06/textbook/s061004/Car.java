package chap06.textbook.s061004;

public class Car {
	int speed;
	
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	
	public static void main(String[] args) {
//		run();  사용 불가능
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run(); // instance가 만들어진 후 사용가능
		
		Math.random();
		Math.abs(-3);
		
	}
}
