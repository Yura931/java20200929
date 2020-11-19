package yuraexnote.methodEx;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.powerOn(); // Calculator() 객체를 할당한 cal 변수를 통해 powerOn()메소드를 실행
		
		int result1 = cal.plus(5, 6);
		System.out.println("result1: " + result1);
		
		byte x = 10;
		byte y = 4;
		
		double result2 = cal.divide(x, y);
		System.out.println("result2: " + result2);
		
		cal.powerOff();
	}
}
