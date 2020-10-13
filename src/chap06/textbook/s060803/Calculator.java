package chap06.textbook.s060803;

public class Calculator {
	int plus(int x, int y) {
		int result = x + y;
		return result;
		}
	
	double avg(int x, int y) {
		double sum = plus(x, y);
		double result = sum / 2;
		return result;
	}
	
	void execute() {
		double result = avg(7, 10); //avg라는 자기자신 method를 불러옴
		println("실행결과: " + result);
	}
	
	void println(String message) {
		System.out.println(message);
		
//		메소드는 내부에서도 사용될 수 있다.
	}
}
