package chap06.lecture.constructor;

public class Car {
	String name;
	int price;
	
	// 생성자
	// 클래스명(파라미터목록) {
	// 	 실행코드;
	//}
	public Car() {
		System.out.println("생성자 실행됨"); //statement들을 가질 수 있음, method같은 것
		name = "kia";
		price = 500;
	}
	// 생성자는 field를 초기화 하는 일을 함
	// 생성자는 파라미터를 받을 수 있다.
	
	public Car(String carName) {
		System.out.println("String 받는 생성자 실행됨");
		System.out.println(carName);
		name = carName;
	}
	
	public Car(String carName, int carPrice) {
		name = carName;
		price = carPrice;
	}
}
