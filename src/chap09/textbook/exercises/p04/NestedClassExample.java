package chap09.textbook.exercises.p04;

public class NestedClassExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		Car.Tire tire = myCar. new Tire();
				
		Car.Engine engine = new Car.Engine(); // static은 바깥 클래스에 바로 접근하여 생성
	}
}
