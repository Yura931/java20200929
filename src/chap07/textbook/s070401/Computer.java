package chap07.textbook.s070401;

public class Computer extends Calculator {
	@Override
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	// 상속받은 부모클래스 재정의 가능
	}
}
