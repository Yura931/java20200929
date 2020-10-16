package chap07.textbook.s070803;

public class PhoneExample {
	public static void main(String[] args) {
		//Phone phone = new Phone(); abstract 클래스를 선언한 Phone의 생성자를 호출해서 객체를 생성할 수 없음을 보여준다.
		
		SmartPhone smartPhone = new SmartPhone("홍길동"); // 대신 자식 클래스인 SmartPhone으로 객체를 생성해서 Phone의 메소드인 turnOn(), turnOff() 메소드를 사용
				
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}
}
