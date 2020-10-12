package chap06.lecture.constructor;

public class ConsructorEX01 {
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();
		
		// 생성자를 작성하지 않으면 , 아무일도 안하는 생성자가 자동으로 compile 됨
		System.out.println(car1.name);
		System.out.println(car1.price);
		
		System.out.println(car2.name);
		System.out.println(car2.price);
		
		Car car3 = new Car("volvo"); 
		Car car4 = new Car("benz");
		
		System.out.println(car3.name);
		System.out.println(car4.name);
		
		System.out.println(car3.price);
		System.out.println(car4.price);
		
		Car car5 = new Car("hyundai", 700); // parameter의 갯수와 타입을 보고 판다.
		System.out.println(car5.name);
		System.out.println(car5.price);
		
		Car car6 = new Car("samsung", 800);
		System.out.println(car6.name);
		System.out.println(car6.price);
		
	}
}
